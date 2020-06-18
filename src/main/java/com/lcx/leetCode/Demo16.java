package com.lcx.leetCode;

public class Demo16 {
    public static double myPow(double x, int n) {
        double result = 0;
        if (n > 0) {
            result = x;
            for (int i = 1; i < n; i++) {
                result *= x;
            }
        } else if (n == 0) {

        } else {
            double y = 1.0 / x;
            int m = (-1) * n;
            result = y;
            for (int i = 1; i < m; i++) {
                result *= y;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(myPow(2.0, -2));
    }
}
