package com.lcx.leetCode;

public class Demo7 {
    public static int reverse(int x) {
       int c = 0;
        while(x!=0){
            int temp = c;
            c = c*10 + x%10;
            x /= 10;
            if(c/10 != temp){
                c = 0;
                break;
            }
        }
        return c;
    }
}
