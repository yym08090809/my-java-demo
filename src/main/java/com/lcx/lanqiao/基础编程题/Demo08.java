package com.lcx.lanqiao.基础编程题;

import java.util.Scanner;

/**
 * 高僧斗法
 */
public class Demo08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] ss = scanner.nextLine().split(" ");
        int[] x = new int[ss.length];
        //将小和尚的位置作为数组元素的值
        for (int i = 0; i < x.length; i++)
            x[i] = Integer.parseInt(ss[i]);
        if (!f1(x)) {
            System.out.println(-1);
        } else {
            System.out.println(a + " " + b);
        }
    }

    static int a;
    static int b;


    static boolean f1(int[] x) {
        int[] N = new int[x.length / 2];// 堆的大小
        for (int i = 0; i < N.length; i++) {
            N[i] = x[2 * i + 1] - x[2 * i]-1;// 计算每个堆的数字
        }
        int k = N[0];
        for (int i = 1; i < N.length; i++) {
            k ^= N[i]; //连续做异或
        }
        // 现在异或不为0
        if (k != 0) {
            // 找到ni，其x位（k最高位）为1
            String kBinary = Integer.toBinaryString(k);
            for (int i = 0; i < N.length; i++) {
                //当前堆数字的二进制字符串
                String NiBinary = Integer.toBinaryString(N[i]);
                try {
                    //右对齐后和k最高位在同一列的二进制为1
                    if (NiBinary.charAt(NiBinary.length() - kBinary.length()) == '1') {
                        a = x[2*i];  // 首动位置找到了
                        //现在Ni 变为Ni' 使得尼姆堆的全体数字异或为0 只需把k所有为1的位对应的Ni上的位做0~1变换
                        int Nii = N[i];
                        for (int j = 0; j < kBinary.length(); j++) {
                            if (kBinary.charAt(j)=='1')
                                Nii^=(1<<(kBinary.length()-j-1));
                        }

                        // N[i]变为Nii肯定是缩小了，缩小的数就是a应该前进的数
                        b = a+N[i]-Nii;
                        break;
                    }
                } catch (Exception e) {
                    // 位数不够
                }
            }
            return true;
        }
        return false;
    }

}
