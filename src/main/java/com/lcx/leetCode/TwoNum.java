package com.lcx.leetCode;

import java.util.HashMap;

/**
 * . 两数之和
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 * <p>
 * 示例:
 * <p>
 * 给定 nums = [2, 7, 11, 15], target = 9
 * <p>
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 */
public class TwoNum {
    //    public static int[] twoSum(int[] nums, int target) {
//        int[] re = new int[2];
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i+1; j < nums.length; j++) {
//                if(nums[i]+nums[j]==target){
//                    re[0] = i;
//                    re[1] = j;
//                }
//            }
//        }
//        return re;
//    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int comp = target - nums[i];
            if (map.containsKey(comp) && map.get(comp) != i) {
                return new int[]{i, map.get(comp)};
            }
        }
        throw new IllegalArgumentException("No two sum solution!");
    }

    public static void main(String[] args) {
        int[] nums = {2, 11, 7, 15};
        int target = 9;
        int[] re = twoSum(nums, target);
        for (int i = 0; i < 2; i++) {
            System.out.println(re[i]);
        }
    }
}
