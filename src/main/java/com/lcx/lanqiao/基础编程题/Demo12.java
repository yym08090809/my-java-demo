package com.lcx.lanqiao.基础编程题;

import java.util.Scanner;

/**
 * 杨辉三角形又称Pascal三角形，它的第i+1行是(a+b)i的展开式的系数。
 * <p>
 * <p>
 * 它的一个重要性质是：三角形中的每个数字等于它两肩上的数字相加。
 * <p>
 * <p>
 * 下面给出了杨辉三角形的前4行：
 * <p>
 * <p>
 * 1
 * <p>
 * <p>
 * 1 1
 * <p>
 * <p>
 * 1 2 1
 * <p>
 * <p>
 * 1 3 3 1
 * <p>
 * <p>
 * 给出n，输出它的前n行。
 * <p>
 * 1
 * 1 1
 * 1 2 1
 * 1 3 3 1
 */
public class Demo12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
                }

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
