package com.lcx.lanqiao.基础编程题;

import java.util.Scanner;

/**
 * 给出n个数，找出这n个数的最大值，最小值，和。
 */
public class Demo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

//求和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        //冒泡排序
        for (int i = 0; i < arr.length; i++) {
                for (int j = arr.length-1; j >= i ; j--) {
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(arr[0]);
        System.out.println(arr[arr.length-1]);
        System.out.println(sum);
    }
}
