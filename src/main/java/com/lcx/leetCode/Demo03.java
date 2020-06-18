package com.lcx.leetCode;

import java.util.Arrays;

/**
 * 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。
 *
 * 请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
 *
 * 你可以假设 nums1 和 nums2 不会同时为空。
 *
 * 示例 1:
 *
 * nums1 = [1, 3]
 * nums2 = [2]
 *
 * 则中位数是 2.0
 * 示例 2:
 *
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 *
 * 则中位数是 (2 + 3)/2 = 2.5
 */
public class Demo03 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length+nums2.length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            if(i<nums1.length){
                arr[i]=nums1[i];
            }else {
                arr[i]=nums2[i-nums1.length];
            }
        }

        int[] re = countingSort(arr);
        double result;
        if(n%2!=0){
            result = arr[n/2];
        }else {
            result = (arr[n/2-1]+arr[n/2])/2.0;
        }

//        for (int i = 0; i < n; i++) {
//            System.out.println(arr[i]);
//        }
       return result;
    }

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
        int[] nums1 = {2,3,5,1};
        int[] nums2 = {5,7,6,8};
        double re = findMedianSortedArrays(nums1, nums2);
        System.out.println(re);
    }
}
