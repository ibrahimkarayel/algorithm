package com.pironix.hackerrank.tagparse;

import java.util.*;

/**
 * Created by ikarayel on 12/28/2016.
 */
public class TagSolution {

    /**
     * 4
     * <h1>Nayeem loves counseling</h1>
     * <h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>
     * <Amee>safat codes like a ninja</amee>
     * <SA premium>Imtiaz has a secret crush</SA premium>
     *
     * @param args
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String line = in.nextLine();

            Queue<String> queue = testTag(line);
            while (!queue.isEmpty()) {
                System.out.println(queue.remove());
            }

            testCases--;
        }


    }

    private static Queue<String> testTag(String line) {
        StringTokenizer st = new StringTokenizer(line, "<>");
        Queue<String> queue = new LinkedList<String>();
        Stack<String> stack = new Stack<String>();
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            if (token.startsWith("/") && stack.size() > 1) {
                String top = stack.pop();
                String top2 = stack.pop();
                if (top2.equals(token.substring(1))) {
                    queue.add(top);
                } else {
                    stack.pop();
                    queue.add("None");
                }
            } else {
                stack.push(token);
            }
        }
        return queue;
    }

}
