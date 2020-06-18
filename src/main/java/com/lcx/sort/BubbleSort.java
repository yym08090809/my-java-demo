package com.lcx.sort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {2, 3, 1, 4, 8, 5, 7};
        int[] re = bubbleSort(array);
        for (int i = 0; i < re.length; i++) {
            System.out.print(re[i] + " ");
        }

    }

    public static int[] bubbleSort(int[] array) {
        if (array.length == 0) {
            return array;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
