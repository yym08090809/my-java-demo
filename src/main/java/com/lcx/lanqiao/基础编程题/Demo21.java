package com.lcx.lanqiao.基础编程题;

import java.util.Scanner;

public class Demo21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //输入
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int[][] temp = arr;
        //矩阵变化
        for (int i = 2; i <= m; i++) {
            temp = returnMatrixResult(temp, arr);
        }

        //输出
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(temp[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] returnMatrixResult(int[][] temp, int[][] arr) {
        int n = arr.length;
        int[][] re = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                for (int k = 0; k < arr.length; k++) {
                    re[i][j] += temp[i][k] * arr[k][j];
                }
            }
        }
        return re;
    }
}
