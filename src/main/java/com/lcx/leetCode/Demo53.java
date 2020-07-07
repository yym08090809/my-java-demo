package com.lcx.leetCode;

public class Demo53 {
    public static int maxSubArray(int[] nums) {
        int temp = nums[0];
        int sum = 0;
        for (int num : nums) {
            //如果当前累加和大于0 就继续累加
            if(sum > 0){
                sum +=  num;
            }else {
            //如果当前累加和小于0 放弃前面累加和 因为一个负数+一个数 肯定小于当前数
                sum = num;
            }
            temp = Math.max(temp,sum);
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }
}
