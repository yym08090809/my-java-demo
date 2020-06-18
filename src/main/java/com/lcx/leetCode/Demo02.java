package com.lcx.leetCode;

import java.util.Scanner;

/**
 * 有两个容量分别为 x升 和 y升 的水壶以及无限多的水。请判断能否通过使用这两个水壶，从而可以得到恰好 z升 的水？
 * <p>
 * 如果可以，最后请用以上水壶中的一或两个来盛放取得的 z升 水。
 * <p>
 * 你允许：
 * <p>
 * 装满任意一个水壶
 * 清空任意一个水壶
 * 从一个水壶向另外一个水壶倒水，直到装满或者倒空
 * <p>
 * 输入: x = 3, y = 5, z = 4
 * 输出: True
 * <p>
 * 输入: x = 2, y = 6, z = 5
 * 输出: False
 */
public class Demo02 {
    public static boolean canMeasureWater(int x, int y, int z) {
        if (x + y < z)
            return false;
        else if (x + y == z || x == z || y == z)
            return true;
        else if (x == 0 && y == z) {
            return true;
        } else if (y == 0 && x == z) {
            return true;
        }else if (x == 0 && y != z) {
            return false;
        } else if (y == 0 && x != z) {
            return false;
        }
        else if (z % gcd(x, y) == 0) {
            return true;
        } else {
            return false;
        }
    }

    //连续整数检测算法：
    public static int gcd(int m, int n) {
        int t;
        if (m < n) {
            t = m;
        } else {
            t = n;
        }
        while (m % t != 0 || n % t != 0) {
            t--;
        }
        return t;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        boolean b = canMeasureWater(x, y, z);
        System.out.println(b);

    }
}
