package com.lcx.leetCode;

import java.util.ArrayList;

public class Demo66 {
    public static Integer[] plusOne1(int[] digits) {
        StringBuffer sb = new StringBuffer();
        for (int digit : digits) {
            sb.append(digit);
        }
        String s = sb.toString();
        Integer i = Integer.parseInt(s);
        i++;
        ArrayList<Integer> list = new ArrayList<Integer>();
        String s1 = i.toString();
        String[] split = s1.split("");
        for (int j = 0; j < split.length; j++) {
            list.add(Integer.parseInt(split[j]));
        }
        Integer[] array = list.toArray(new Integer[list.size()]);
        return array;

    }
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length-1; i >=0 ; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if(digits[i] != 0) return digits;
        }
        digits = new int[digits.length+1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
        int[] arr = {9,9,1};
        int[] ints = plusOne(arr);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}

