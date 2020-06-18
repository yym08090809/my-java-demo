package com.lcx.sort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {8, 2, 7, 3, 6, 43, 5, 9};
        int[] re = mergeSort(arr);

        for (int i = 0; i < re.length; i++) {
            System.out.print(re[i] + " ");
        }
    }

    private static int[] mergeSort(int[] arr) {
        if (arr.length < 2) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);//copyOfRange方法复制的数组不包含mid，及[0,mid)
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);
        return merge(mergeSort(left), mergeSort(right));
    }

    private static int[] merge(int[] left, int[] right) {
        int[] re = new int[left.length + right.length];
        for (int index = 0, i = 0, j = 0; index < re.length; index++) {
            if (i >= left.length) {
                re[index] = right[j++];
            } else if (j >= right.length) {
                re[index] = left[i++];
            } else if (left[i] > right[j]) {
                re[index] = right[j++];
            } else {
                re[index] = left[i++];
            }
        }
        return re;
    }
}
