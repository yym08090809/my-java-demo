package com.lcx.leetCode;

import java.util.Arrays;

public class Demo215 {
    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);//升序
        return nums[nums.length-k];
    }

    public static void main(String[] args) {
        int[] nums = {3,2,3,1,2,4,5,5,6};
        System.out.println(findKthLargest(nums,4));
    }
}
