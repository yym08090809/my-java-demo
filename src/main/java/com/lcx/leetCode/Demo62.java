package com.lcx.leetCode;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * 约瑟夫环问题
 * 总结一下反推的过程，就是 (当前re + m) % 上一轮剩余数字的个数。
 */
public class Demo62 {
    public static int lastRemaining(int n, int m) {
        ArrayList<Integer> nums = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            nums.add(i);
        }
        int index = 0;
        while (n > 1) {
            index = (index + m - 1) % n;
            nums.remove(index);
            n--;
        }
        return nums.get(0);
    }

    public static int lastRemaining1(int n, int m) {
        int re = 0;
        for (int i = 2; i <= n; i++) {
            re = (re + m) % i;
        }
        return re;
    }

    public static void main(String[] args) {
        System.out.println(lastRemaining1(5,3));
    }
}
