package com.pironix.booking.sumarray;

/**
 * Created by ikarayel on 2/11/2017.
 */

import java.util.*;

/**
 * Problem
 * <p>
 * Identify whether there exists a pair of numbers in an array such that their sum is equal to N.
 * <p>
 * Input: The first line contains one integer N, which is the sum we are trying to find.
 * The second line contains one integer M, which is the length of the array.
 * This is followed by M lines each containing one element of the array.
 * <p>
 * Output: Output 1 if there exists a pair of numbers in the array such that their sum equals N. If such a pair does not exist, output 0.
 * <p>
 * Sample Input:
 * 66
 * 10
 * 18
 * 11
 * 21
 * 28
 * 31
 * 38
 * 40
 * 55
 * 60
 * 62
 * <p>
 * Sample Output:
 * <p>
 * 1
 */
public class Solution2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextInt();


        List<Integer> sumArr = new ArrayList<>();

        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            sumArr.add(num);
        }

        System.out.println(findSum(sumArr, sum));
    }

    public static int findSum(List<Integer> sumArr, int sum) {
        Set<Integer> checkSet = new HashSet<>();
        for (int i = 0; i < sumArr.size(); i++) {
            int key = sumArr.get(i);
            if (!checkSet.contains(sum - key)) {
                checkSet.add(key);
            } else {
                System.out.println("Num 1: " + key + " Num 2: " + (sum - key));
                return 1;
            }
        }
        return 0;
    }
}
