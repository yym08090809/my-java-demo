package com.lcx.lanqiao.基础编程题;

import java.util.Scanner;

/**
 * 10进制转16进制
 */
public class Demo16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if(a<0||a>2147483647){
            System.out.println(-1);
        }else if (a==0){
            System.out.println(0);
        }
        else {
            String re = Exchange(a);
            System.out.println(re);
        }
    }

    private static String Exchange(int a) {
        StringBuffer sb = new StringBuffer();
        String s;
        char [] b = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while (a!=0){
            sb = sb.append(b[a%16]);
            a = a/16;
        }
        //reverse()  倒序输出
        s = sb.reverse().toString();
        return s;
    }
}
