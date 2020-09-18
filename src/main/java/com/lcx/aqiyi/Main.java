package com.lcx.aqiyi;

import java.util.Scanner;

/**
 * @author 李松柏
 * @createTime 2020/9/13 16:11
 * @description 多数元素
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.split(" ");
        int[] nums = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            nums[i] = Integer.parseInt(words[i]);
        }
        System.out.println(maxNum(nums));
    }

    private static int maxNum(int[] nums) {
        int vote = 0, x = 0;
        for (int num : nums) {
            if (vote == 0) {
                x = num;
            }
            vote += num == x ? 1 : -1;
        }
        return x;
    }
}
