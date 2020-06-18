package com.lcx.lanqiao.基础编程题;

import java.util.Scanner;

/**
 * 给出一个包含n个整数的数列，问整数a在数列中的第一次出现是第几个。
 */
public class Demo11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long [] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        int a = sc.nextInt();
        int re = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == a && arr[i]<=10000){
                re = i+1;
            }

        }
        System.out.println(re);
    }
}
