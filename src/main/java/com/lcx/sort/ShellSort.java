package com.lcx.sort;

public class ShellSort {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 7, 56, 9, 4, 8};
        int[] re = shellSort(arr);
        for (int i = 0; i < re.length; i++) {
            System.out.print(re[i] + " ");
        }
    }

    private static int[] shellSort(int[] arr) {
        int len = arr.length;
        int temp, gap = len / 2;
        while (gap > 0) {
            for (int i = gap; i < len; i++) {
                temp = arr[i];
                int preIndex = i - gap;
                while (preIndex >= 0 && arr[preIndex] > temp) {
                    arr[preIndex + gap] = arr[preIndex];
                    preIndex -= gap;
                }
                arr[preIndex + gap] = temp;
            }
            gap /= 2;
        }
        return arr;
    }
}