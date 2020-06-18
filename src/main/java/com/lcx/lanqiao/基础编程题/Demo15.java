package com.lcx.lanqiao.基础编程题;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        int a, b, c, d, e, f;
        //所有五位数
        for (int i = 10000; i <= 99999; i++) {
            a = i % 10;
            b = i / 10 % 10;
            c = i / 100 % 10;
            d = i / 1000 % 10;
            e = i / 10000;
            if (a == e && b == d && (a + b + c + d + e == n)) {
                list.add(i);
            }
        }
        //所有六位数
        for (int i = 100000; i <= 999999; i++) {
            a = i % 10;
            b = i / 10 % 10;
            c = i / 100 % 10;
            d = i / 1000 % 10;
            e = i / 10000 % 10;
            f = i / 100000;
            if (a == f && b == e && c == d && (a + b + c + d + e + f == n)) {
                list.add(i);
            }
        }

        for (Integer i:list) {
            System.out.println(i);
        }

    }
}
