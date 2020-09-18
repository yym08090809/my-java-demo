package com.lcx.aqiyi;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 李松柏
 * @createTime 2020/9/12 9:58
 * @description 水仙花数
 */
public class Demo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (sc.hasNext()){
            int n = sc.nextInt();
            int m = sc.nextInt();
            for ( ; n <= m; n++) {
                int a = n % 10;//个位
                int b = n / 10 % 10;//十位
                int c = n /100;//百位
                if(n == (Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3))){
                    //System.out.print(n+" ");
                    list.add(n);
                }
            }
            if(list.isEmpty()){
                System.out.println("no");
            }else {
                for (Integer integer : list) {
                    System.out.print(integer+" ");
                }
                System.out.println();
            }
        }
    }
}
