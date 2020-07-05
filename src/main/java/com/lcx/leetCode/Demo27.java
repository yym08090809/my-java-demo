package com.lcx.leetCode;

public class Demo27 {
    public static int removeElement(int[] nums, int val) {
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val){
                nums[n] = nums[i];
                n++;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        int [] nums = {1,1,2,3,1,5,6};
        int i = removeElement(nums, 1);
        System.out.println(i);
    }
}
