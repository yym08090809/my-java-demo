package com.lcx.sort;

import java.util.Arrays;

public class CountingSort {
    public static int[] countingSort(int[] arr){
        if(arr.length == 0){
            return arr;
        }
        int bias,min = arr[0],max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        bias = 0 - min;
        int[] bucket = new int[max - min +1];
        Arrays.fill(bucket,0);
        for (int i = 0; i < arr.length; i++) {
            bucket[arr[i]+bias]++;
        }
        int index = 0,i =0;
        while (index<arr.length){
            if(bucket[i]!=0){
                arr[index] = i -bias;
                bucket[i]--;
                index++;
            }else {
                i++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {8, 2, 7, 3, 6, 43, 5, 9};
        int[] re = countingSort(arr);

        for (int i = 0; i < re.length; i++) {
            System.out.print(re[i] + " ");
        }
    }
}
