package com.lcx.lanqiao.基础编程题;

import sun.awt.SunHints;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 16转10
 */
public class Demo17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.next();
        String[] nums = num.split("");
//        for (String s:nums) {
//            System.out.println(s);
//        }
        int n = nums.length;
        Map<String, Integer> map = new HashMap<>();
        map.put("0", 0);
        map.put("1", 1);
        map.put("2", 2);
        map.put("3", 3);
        map.put("4", 4);
        map.put("5", 5);
        map.put("6", 6);
        map.put("7", 7);
        map.put("8", 8);
        map.put("9", 9);
        map.put("A", 10);
        map.put("B", 11);
        map.put("C", 12);
        map.put("D", 13);
        map.put("E", 14);
        map.put("F", 15);
        long re = 0;
        for (int i = 0; i < n; i++) {
                    Integer integer = map.get(nums[i]);
                    re += (long) Math.pow(16, n - 1 - i) * integer;
        }
        System.out.println(re);
    }
}
