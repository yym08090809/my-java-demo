package com.lcx.lanqiao.基础编程题;

import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        if(y%400 ==0||(y%4==0&&y%100!=0)){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
