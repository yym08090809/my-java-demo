package com.lcx.sort;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {18, 4, 35, 22, 72, 17, 99, 101, 11};
        int[] re = insertionSort(arr);

        for (int i = 0; i < re.length; i++) {
            System.out.print(re[i] + " ");
        }
    }

    private static int[] insertionSort(int[] arr) {
        if (arr.length == 0) {
            return arr;
        }
        int current;
        for (int i = 0; i < arr.length - 1; i++) {
            current = arr[i + 1];
            int preIndex = i;
            while (preIndex >= 0 && current < arr[preIndex]) {
                arr[preIndex + 1] = arr[preIndex];
                preIndex--;
            }
            arr[preIndex + 1] = current;
        }
        return arr;
    }
}
