package com.lcx.lanqiao.基础编程题;

import java.util.Scanner;

/**
 * 完美的代价   贪心算法
 */
public class Demo23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        String string = scanner.next();
//        while (isHuiWen(string)) {
//            exchange(string);
//        }
        System.out.println(isHuiWen("aba"));
    }

    private static String exchange(String string) {
        return null;
    }

    private static boolean isHuiWen(String string) {
        char[] chars = string.toCharArray();

        int i =0;
        int j =chars.length-1;
        while (true){
            if(i<=j&&chars[i]==chars[j]){
                i++;
                j--;
                continue;
            }
        }
    }
}
