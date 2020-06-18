package com.lcx.sort;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {8, 2, 7, 3, 6, 43, 5, 9};
        int start = 0;
        int end = arr.length-1;
        int[] re = quickSort(arr,start,end);

        for (int i = 0; i < re.length; i++) {
            System.out.print(re[i] + " ");
        }
    }

    private static int[] quickSort(int[] arr, int start, int end) {
        if (arr.length < 1 || start < 0 || end >= arr.length || start > end) {
            return null;
        }
        int smallIndex = partition(arr, start, end);
        if(smallIndex > start){
            quickSort(arr,start,smallIndex-1);
        }
        if(smallIndex <end){
            quickSort(arr,smallIndex+1,end);
        }
        return arr;
    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = (int) (start + Math.random() * (end - start + 1));
        int smallIndex = start - 1;
        swap(arr, pivot, end);
        for (int i = start; i <= end; i++) {
            if (arr[i] <= arr[end]) {
                smallIndex++;
                if (i > smallIndex) {
                    swap(arr, i, smallIndex);
                }
            }
        }
        return smallIndex;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
