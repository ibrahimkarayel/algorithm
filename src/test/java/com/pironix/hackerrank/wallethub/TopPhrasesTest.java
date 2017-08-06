package com.pironix.hackerrank.wallethub;

import com.pironix.wallethub.TopPhrases;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.Instant;
import java.util.Map;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * The TopPhrases Test class
 * Created ikarayel on 1/21/2017.
 *
 * @author ibrahim KARAYEL
 */
public class TopPhrasesTest {

    private static String lineA;
    private static String lineB;
    private static String lineC;
    private static String lineD;
    private static char[] chars;

    @BeforeClass
    public static void oneTimeSetUp() throws Exception {
        lineA = "a|b|c|d";
        lineB = "a|b|c|d";
        lineC = "a|b|c|C";
        chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        System.out.println("@BeforeClass - oneTimeSetUp");
    }

    @AfterClass
    public static void oneTimeTearDown() {
        System.out.println("@AfterClass - oneTimeTearDown");
        lineA = null;
        lineB = null;
        lineC = null;
    }

    /**
     * @throws Exception
     */
    @Test
    public void testGenerateLargeFile() throws Exception {
        long startTime = Instant.now().toEpochMilli();
        TopPhrases.generateLargeFile(null, "file_1GB.txt");
        long endTime = Instant.now().toEpochMilli();
        System.out.println("File creation Elapsed time: " + (endTime - startTime));
    }


    @Test
    public void testLine() throws Exception {
        assertTrue(lineA.equals(lineB));
        assertFalse(lineA.equals(lineC));
    }

    @Test
    public void testGenerateShuffledLine() throws Exception {
        String line1 = TopPhrases.generateShuffledLine();
        String line2 = TopPhrases.generateShuffledLine();

        assertFalse(line1.equals(line2));
        System.out.println(line1);
        System.out.println("********************************************************************************************************************************************************************************************************");
        System.out.println(line2);
    }


    @Test
    public void generateRandomPhrase() throws Exception {
        String[] phrase = TopPhrases.generateRandomPhrase(3);
        for (String in : phrase) {
            System.out.print(in + " ");
        }
    }


    @Test
    public void testFindTopPhrases() throws IOException {

        try (InputStream stream = new FileInputStream(new File("file_10GB.txt"))) {
            long startTime = Instant.now().toEpochMilli();
            Map<String, Integer> resultMap = TopPhrases.findTopPhrases(stream, TopPhrases.LIMIT);
            long endTime = Instant.now().toEpochMilli();
            TopPhrases.writeResultToFile(resultMap, (endTime - startTime));
        }
    }

    @Test
    public void testFindTopPhrases2() throws IOException {

        try (InputStream stream = new FileInputStream(new File("spaced_file.txt"))) {
            long startTime = Instant.now().toEpochMilli();
            Map<String, Integer> resultMap = TopPhrases.findTopPhrases(stream, TopPhrases.LIMIT);
            long endTime = Instant.now().toEpochMilli();
            TopPhrases.writeResultToFile(resultMap, (endTime - startTime));
        }
    }

}