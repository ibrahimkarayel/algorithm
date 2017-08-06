package com.pironix.wallethub;

import java.io.*;
import java.time.Instant;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 * The Most Frequent Phrases class
 * Created ibrahim on 1/21/2017.
 *
 * @author ibrahim KARAYEL
 */
public class TopPhrases {

    private static final Logger logger = Logger.getLogger(TopPhrases.class.getName());
    private static final int GB = 1;
    private static final String OUTPUT_FILE = "output.log";
    public static final int LIMIT = 100000;
    private static final int RND_PHRASE_COUNT = 1000;
    private static final long BYTE_TO_GB = 1024 * 1024 * 1024;

    private static final char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    private static final String[] lineInputs;

    static {
        lineInputs = TopPhrases.generateRandomPhrase(3);

    }

    public static void main(String[] args) {
        try (InputStream stream = new FileInputStream(new File("file_1GB.txt"))) {
            long startTime = Instant.now().toEpochMilli();
            Map<String, Integer> resultMap = findTopPhrases(stream, LIMIT);
            long endTime = Instant.now().toEpochMilli();

            logger.info("Total Find Top Phrases Elapsed time: " + (endTime - startTime));
            TopPhrases.writeResultToFile(resultMap, (endTime - startTime));
        } catch (FileNotFoundException e) {
            logger.log(Level.SEVERE, e.getMessage());
        } catch (IOException e) {
            logger.log(Level.SEVERE, e.getMessage());
        }


    }

    /**
     * @param inputStream input file stream
     * @param limit       Top Phrases limit
     * @return Top Limit Phrases of file
     */
    public static Map<String, Integer> findTopPhrases(InputStream inputStream, int limit) {

        //Create a map, where the key is the phrase, and the value is the occurrence of  phrase
        //O(N) extra space
        Map<String, Integer> topPhrases = new HashMap();

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream))) {

            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                String[] linePhrases = line.split("\\|");
                for (String in : linePhrases) {
                    in = in.trim();
                    //if Map contains key increment phrase count else add the phrase
                    if (topPhrases.containsKey(in)) {
                        topPhrases.put(in, topPhrases.get(in).intValue() + 1);
                    } else {
                        topPhrases.put(in, 1);
                    }
                }
            }
            //Sort the collection by Map value and limit by LIMIT size
            //return LinkedHashMap it will iterate in the order in which the entries were put into the map
            // O N(Lon N) sort
            topPhrases = topPhrases.entrySet().stream()
                    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                    .limit(limit)
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (v1, v2) -> v1, LinkedHashMap::new));

        } catch (IOException e) {
            logger.log(Level.SEVERE, e.getMessage());
        }

        return topPhrases;
    }

    /**
     * Write result to log file or other .txt file
     * For this project we don't have any logging  configuration
     * so we write output in a text file under the root dir of the project
     *
     * @param resultMap TopPhrases map
     */
    public static void writeResultToFile(Map<String, Integer> resultMap, long elapsedTime) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(OUTPUT_FILE), 512)) {
            for (Map.Entry entry : resultMap.entrySet()) {
                writer.write(entry.getKey() + " , " + entry.getValue());
                writer.newLine();
                logger.info(entry.getKey() + " , " + entry.getValue());
            }
            writer.newLine();
            writer.write("Total Distinct Phrases : " + resultMap.size());
            writer.newLine();
            writer.write("Total Find Top Phrases Elapsed time :" + elapsedTime);
            writer.newLine();
        } catch (IOException e) {
            logger.log(Level.SEVERE, e.getMessage());
        }
    }

    public static void generateLargeFile(String filePath, String fileName) {
        File file;
        if (fileName == null)
            fileName = "input.txt";
        if (filePath != null) {
            file = new File(filePath + System.getProperty("file.separator") + fileName);
            logger.info("New File -> " + file.getAbsolutePath());

        } else {
            file = new File(fileName);
            logger.info("New File  -> " + file.getAbsolutePath());
        }
        long startTime = Instant.now().toEpochMilli();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file), 512)) {
            while (file.length() / (BYTE_TO_GB) < GB) {
                //don't check file.length() for every line check it per 10000 line
                for (int i = 0; i < 10000; i++) {
                    writer.write(TopPhrases.generateShuffledLine());
                    writer.newLine();
                }

            }
        } catch (IOException e) {
            logger.log(Level.SEVERE, e.getMessage());

        }
        long endTime = Instant.now().toEpochMilli();
        logger.info(GB + " GB :  File creation Elapsed time : " + (endTime - startTime));
    }


    /**
     * @return shuffled string
     * Java shuffle method has O(n) time complexity.
     */
    public static String generateShuffledLine() {
        List<String> line = new ArrayList(Arrays.asList(lineInputs));
        Collections.shuffle(line);
        String listString = line.subList(0, 50).stream().map(Object::toString).collect(Collectors.joining("|"));
        return listString;
    }

    public static String[] generateRandomPhrase(int range) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        String[] randomInput = new String[RND_PHRASE_COUNT];
        for (int i = 0; i < RND_PHRASE_COUNT; i++) {
            for (int j = 0; j < range; j++) {
                char c = chars[random.nextInt(chars.length)];
                sb.append(c);

            }
            randomInput[i] = sb.toString();
            sb.delete(0, sb.length());
        }
        return randomInput;

    }

}
