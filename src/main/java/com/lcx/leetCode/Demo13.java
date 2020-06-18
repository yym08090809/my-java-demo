package com.lcx.leetCode;

import java.util.Scanner;

public class Demo13 {
    public int romanToInt(String s) {
        int sum = 0;
        int perNum = getValue(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            int num = getValue(s.charAt(i));
            if(perNum < num){
                sum-=perNum;
            }else {
                sum +=perNum;
            }
            perNum = num;
        }
        sum+=perNum;
        return sum;
    }

    private int getValue(char ch) {
        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println(new Demo13().romanToInt(s));
    }
}

