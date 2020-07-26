package com.lcx.leetCode;

/**
 * @author 李松柏
 * @createTime 2020/7/26 17:10
 * @description 爬楼梯
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 */
public class Demo70 {
    public static int climbStairs(int n) {
        /**
         * 动态规划
         * n=0 return 1;
         * n=1 return 1;
         * n=2 return 2;
         * n=3 return 3;
         *
         */
        int p = 0, q = 0,x = 1;
        for (int i = 1; i <= n; i++) {
            p = q;
            q = x;
            x = p + q;
        }
        return x;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(10));
    }
}
