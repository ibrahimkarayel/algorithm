package com.pironix.sort.insertion;

/**
 * en kucuk sayi basa gelecek sekilde bastan baslanarak sayi daha kucuk ise yer degistirilir.
 */
public class InsertionSort {

    public static void main(String... args) {


        int[] arr = new int[]{1, 5, 9, 11, 0, 2, 4};

        insertionSort(arr);

        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);


    }

    public static void insertionSort(int[] arr) {
        //1 |5,9,11,0,2,4

        int j, val;
        for (int i = 1; i < arr.length; i++) {
            val = arr[i];
            j = i;
            while (j > 0 && arr[j - 1] > val) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = val;
        }


    }
}