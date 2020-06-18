package com.lcx.lanqiao.基础编程题;

/**
 * 1221是一个非常特殊的数，它从左边读和从右边读是一样的，编程求所有这样的四位十进制数。
 */
public class Demo14 {
    public static void main(String[] args) {
        int a,b,c,d;
        for (int i = 1000; i <= 9999; i++) {
            a = i%10;
            b = i/10%10;
            c = i/100%10;
            d = i/1000;

            if(a == d && b == c){
                System.out.println(i);
            }
        }
    }
}
