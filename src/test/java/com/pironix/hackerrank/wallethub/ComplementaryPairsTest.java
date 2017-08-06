package com.pironix.hackerrank.wallethub;

import com.pironix.wallethub.ComplementaryPairs;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

/**
 * The Complementary Pairs Test class
 * Created ikarayel on 1/21/2017.
 *
 * @author ibrahim KARAYEL
 */
public class ComplementaryPairsTest {


    private static int[] input1 = new int[]{12, 1, 7, 7, 4, 4, 2, 6, 14, 14};
    private static int[] input2 = new int[]{2, 14, 5, 11, 4, 12, 13, 7, 14, 0};

    @BeforeClass
    public static void oneTimeSetUp() throws Exception {
        System.out.println("@BeforeClass - oneTimeSetUp");
    }

    @AfterClass
    public static void oneTimeTearDown() {
        System.out.println("@AfterClass - oneTimeTearDown");
    }

    @Test
    public void testFindPairs() throws Exception {
        ComplementaryPairs.findPairs(input1, 11);
    }

    @Test
    public void testFindPairs2() throws Exception {
        ComplementaryPairs.findPairs(input2, 12);
    }

    @Test
    public void testFindPairsRandom() throws Exception {
        for (int i = 0; i < 10; i++) {
            int[] arr = ComplementaryPairs.getRandomArray(i + 3, i - 5, i + 3);
            System.out.println(Arrays.toString(arr) + " key: " + i + 2);
            ComplementaryPairs.findPairs(arr, i + 2);
            System.out.println();
            System.out.println("*****************************");
        }
    }

    @Test
    public void testGetRandomArray() throws Exception {
        int[] arr1 = ComplementaryPairs.getRandomArray(9, -5, 15);
        int[] arr2 = ComplementaryPairs.getRandomArray(10, 0, 10);
        assertTrue(arr1.length == 9);
        assertTrue(arr2.length == 10);

    }
}