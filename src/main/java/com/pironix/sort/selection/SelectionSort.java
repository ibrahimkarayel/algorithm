package com.pironix.sort.selection;

/**
 * Created by ikarayel on 3/4/2017.
 * <p>
 * insertion sort dan daha kotudur. Buyuk veriler uzerinde verim saglamaz
 * dizi icerisinde en kucuk elemanı secer
 * tersten sirali ise en kotu durum her seferinde hepsine bakar
 * en iyi durum sirali olmasi o durumda da n^2 olur
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 9, 11, 0, 2, 4};
        selectionSort(arr);

        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }

    private static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }

            }
            if (minIndex != i) {
                int tmp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = tmp;
            }

        }
    }
}
