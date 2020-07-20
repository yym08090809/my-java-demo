package com.lcx.leetCode;

/**
 * @author 李松柏
 * @createTime 2020/7/20 23:40
 * @description 力扣69题：X的平方根
 */
public class Demo69 {
    public static int mySqrt(int x) {
        long re=0;
        int i = 1;
        while (i<=x){
            re = x/i;
            if( re*re> x){
                i++;
            }
            else {
                break;
            }
        }
        return (int)re;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(2147395599));
    }
}
