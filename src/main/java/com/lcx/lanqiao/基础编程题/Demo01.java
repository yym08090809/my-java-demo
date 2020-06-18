package com.lcx.lanqiao.基础编程题;

import java.text.NumberFormat;
import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(7);
        nf.setGroupingUsed(false);
        double re =Math.PI*r*r;
        System.out.println(nf.format(re));//80 20106.192983
        System.out.printf("%.7f",re);
    }
}
