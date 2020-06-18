package com.lcx.lanqiao.基础编程题;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int f1 = 1, f2 = 1, f3 = 0;
        if (n < 3) {
            System.out.println(1);
        } else {
            for (int i = 3; i <= n; i++) {
                if (f1 > 10007)
                    f1 = f1 % 10007;
                if (f2 > 10007)
                    f2 = f2 % 10007;
                f3 = f1 + f2;
                f1 = f2;
                f2 = f3;
            }
            System.out.println(f3 % 10007);
        }
    }
}
