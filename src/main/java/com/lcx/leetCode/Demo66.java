package com.lcx.leetCode;

public class Demo66 {
    public static int[] plusOne(int[] digits) {
        StringBuffer sb = new StringBuffer();
        for (int digit : digits) {
            sb.append(digit);
        }
        String s = sb.toString();
        System.out.println(s.length());
        Integer i = Integer.parseInt(s);

        i++;
        String[] split = i.toString().split("");
        for (String s1 : split) {
            System.out.println(s1);
        }
        int arr[] = new int[split.length];
//        for (int j = 0; j < split.length; j++) {
//            arr[i] = Integer.parseInt(split[i]);
//        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int[] ints = plusOne(arr);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}

