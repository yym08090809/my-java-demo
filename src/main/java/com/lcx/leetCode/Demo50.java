package com.lcx.leetCode;

public class Demo50 {

    //暴力解法时间会超时
    /*public static double myPow(double x, int n) {
        double num = 1;
        if(n>0){
            for (int i = 0; i < n; i++) {
                num *= x;
            }
            return num;
        }
        else if(n == 0) return num;
        else {
            double a = 1/x;
            for (int i= 0; i< Math.abs(n);i++){
                 num *= a;
            }

            return num;
        }
    }*/
    public static double quickMul(double x,Long N){
        if(N==0){
            return 1.0;
        }else {
            double y = quickMul(x,N/2);
            return N%2 == 0 ? y*y : y*y*x;
        }
    }
    public static double myPow(double x, int n) {
        long N = n;
        return N >= 0 ? quickMul(x,N) : 1.0/quickMul(x,-N);
    }

    public static void main(String[] args) {
        System.out.println(myPow(2,10));
        System.out.println(myPow(2.1,3));
        System.out.println(myPow(2,-2));
    }
}
