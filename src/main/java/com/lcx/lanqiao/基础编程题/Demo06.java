package com.lcx.lanqiao.基础编程题;


public class Demo06 {
    public static void main(String[] args) {
        String str = "";
        for (int i = 0; i < 32; i++) {
            str=Integer.toBinaryString(i);
            int length = str.length();
            while (length<=4){
                System.out.print(0);
                length++;
            }
            System.out.println(str);
        }
    }
}
