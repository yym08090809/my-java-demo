package com.lcx.lanqiao.基础编程题;

import java.util.Scanner;

/**
 * 求出区间[a,b]中所有整数的质因数分解。
 *
 * 输入两个整数a，b。
 *
 * 每行输出一个数的分解，形如k=a1*a2*a3...(a1<=a2<=a3...，k也是从小到大的)(具体可看样例)
 *
 * 3 10
 *
 * 3=3
 * 4=2*2
 * 5=5
 * 6=2*3
 * 7=7
 * 8=2*2*2
 * 9=3*3
 * 10=2*5
 *
 * 先筛出所有素数，然后再分解。
 */
public class Demo20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for (int i = a; i <= b; i++) {
            getGre(i);
        }
    }

    private static void getGre(int i) {
        int k = 2 ;
        System.out.print(i+"=");
        while (k<=i){
            if(k==i){
                System.out.println(""+i);
                break;
            }
            else if(i%k == 0){
                System.out.print(k+"*");
                i = i/k;
            }else {
                k++;
            }
        }
    }
}
