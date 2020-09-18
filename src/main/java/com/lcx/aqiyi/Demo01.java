package com.lcx.aqiyi;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author 李松柏
 * @createTime 2020/9/12 9:47
 * @description 求数列和
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            double n = sc.nextDouble();
            int m = sc.nextInt();
            double sum = 0;
            for (int i = 0; i < m; i++) {
                sum += n;
                n = Math.pow(n,0.5);
            }
            System.out.printf("%.2f",sum);
        }
    }
}
