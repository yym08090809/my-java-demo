package com.lcx.小赛;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int money =computeMoney(scanner.nextInt());
            System.out.println(money);
        }
    }

    private static int computeMoney(int n) {
        int money =1;
        int i =0;
        while (true){
            // i初始值为0，如果n处于两次降跌之间，
            // i值不变,即n大于等差数列（i+2）
            // 的前i项之和且小于等于前（i+1）项之和时，
            // 那么跳出循环计算money
            if((i+3)*i<2*n&&2*n<=(i+4)*(i+1))break;

            ++i;
        }
        money = n-2*i;
        return  money;
    }
}
