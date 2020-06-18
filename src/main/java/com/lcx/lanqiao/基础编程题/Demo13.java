package com.lcx.lanqiao.基础编程题;

/**
 * 　153是一个非常特殊的数，它等于它的每位数字的立方和，即153=1*1*1+5*5*5+3*3*3。编程求所有满足这种条件的三位十进制数。
 */
public class Demo13 {

    public static void main(String[] args) {
        int a, b, c;
        for (int i = 100; i < 999; i++) {
            a = i % 10;
            b = i / 10 % 10;
            c = i / 100;
            if ((Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3)) == i) {
                System.out.println(i);
            }
        }
    }
}
