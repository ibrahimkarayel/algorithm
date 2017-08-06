package com.pironix.hackerrank.quartiles;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * The Quartiles Solution Test class
 *
 * @author ibrahim KARAYEL
 * @version 1.0
 * @sice 9/10/2016
 */
public class QuartilesSolutionTest {


    private static Integer[] quartiles = {1, 5, 7, 95, 3, 15, 55};
    private static Integer[] quartiles2 = {11, 50, 7, 4, 3, 15, 90, 8};
    private static Integer[] quartiles3 = {1, 5, 7, 9, 3, 15, 55, 0, 9, 11, 32};
    private static Integer[] quartiles4 = {1, 5, 7, 9};
    private static Integer[] quartiles5 = {1, 5, 7, 9, 3};

    @Test
    public void testWriteQuartiles() throws Exception {
        Integer[] result;

        System.out.println("*********************************************");
        result = QuartilesSolution.writeQuartiles(quartiles.length, quartiles);
        System.out.println(Arrays.asList(result).toString());
        assertEquals(result[0].intValue(), 3);
        assertEquals(result[1].intValue(), 7);
        assertEquals(result[2].intValue(), 55);

        System.out.println("*********************************************");
        result = QuartilesSolution.writeQuartiles(quartiles2.length, quartiles2);
        System.out.println(Arrays.asList(result).toString());
        assertEquals(result[0].intValue(), 5);
        assertEquals(result[1].intValue(), 9);
        assertEquals(result[2].intValue(), 32);

        System.out.println("*********************************************");
        result = QuartilesSolution.writeQuartiles(quartiles3.length, quartiles3);
        System.out.println(Arrays.asList(result).toString());
        assertEquals(result[0].intValue(), 3);
        assertEquals(result[1].intValue(), 9);
        assertEquals(result[2].intValue(), 15);

        System.out.println("*********************************************");
        result = QuartilesSolution.writeQuartiles(quartiles4.length, quartiles4);
        System.out.println(Arrays.asList(result).toString());
        assertEquals(result[0].intValue(), 0);
        assertEquals(result[1].intValue(), 0);
        assertEquals(result[2].intValue(), 0);

        System.out.println("*********************************************");
        result = QuartilesSolution.writeQuartiles(quartiles5.length, quartiles5);
        System.out.println(Arrays.asList(result).toString());
        assertEquals(result[0].intValue(), 2);
        assertEquals(result[1].intValue(), 5);
        assertEquals(result[2].intValue(), 8);

    }


}