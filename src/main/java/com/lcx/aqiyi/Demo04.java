package com.lcx.aqiyi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author 李松柏
 * @createTime 2020/9/13 15:43
 * @description 三数之和
 * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有满足条件且不重复的三元组。
 * <p>
 * 注意：答案中不可以包含重复的三元组。
 */
public class Demo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.split(" ");
        int[] nums = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            nums[i] = Integer.parseInt(words[i]);
        }
        List<List<Integer>> res = threeSum(nums);
        for (List<Integer> re : res) {
            for (Integer integer : re) {
                System.out.print(integer+" ");
            }
            System.out.println();
        }
    }

    private static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int k = 0; k < nums.length - 2; k++) {
            if (nums[k] > 0)
            {
                break;
            }
            if (k > 0 && nums[k] == nums[k - 1]) {
                continue;
            }
            int i = k + 1, j = nums.length - 1;
            while (i < j) {
                int sum = nums[k] + nums[i] + nums[j];
                if (sum < 0) {
                    while (i < j && nums[i] == nums[++i]) ;
                } else if (sum > 0) {
                    while (i < j && nums[j] == nums[--j]) ;
                } else {
                    List<Integer> tmp = new ArrayList<>();
                    tmp.add(nums[k]);
                    tmp.add(nums[i]);
                    tmp.add(nums[j]);
                    res.add(tmp);
                    while (i < j && nums[j] == nums[++i]) ;
                    while (i < j && nums[j] == nums[--j]) ;
                }
            }
        }
        return res;
    }
}
