package com.lcx.sort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {8, 2, 7, 3, 6, 43, 5, 9};
        int[] re = selectionSort(arr);

        for (int i = 0; i < re.length; i++) {
            System.out.print(re[i] + " ");
        }
    }

    private static int[] selectionSort(int[] arr) {
        if (arr.length == 0) {
            return arr;
        }
        for (int i = 0; i < arr.length; i++) {
            int index = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[index]) {//找到最小的数
                    index = j;//将最小数的索引保存
                }
            }
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
