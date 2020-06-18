package com.lcx.lanqiao.基础编程题;

import java.util.Scanner;

/**
 *
 * 给定一个以秒为单位的时间t，要求用“<H>:<M>:<S>”的格式来表示这个时间。
 * <H>表示时间，<M>表示分钟，而<S>表示秒，它们都是整数且没有前导的“0”。
 * 例如，若t=0，则应输出是“0:0:0”；若t=3661，则输出“1:1:1”。
 *
 * 输入只有一行，是一个整数t（0<=t<=86399）。
 * 输出只有一行，是以“<H>:<M>:<S>”的格式所表示的时间，不包括引号。
 */
public class Demo18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        int h = t/3600;
        int m = t%3600/60;
        int s = t%3600%60;
        System.out.print(h+":"+m+":"+s);
    }
}
