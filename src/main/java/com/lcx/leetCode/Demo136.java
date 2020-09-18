package com.lcx.leetCode;

/**
 * @author 李松柏
 * @createTime 2020/9/14 0:05
 * @description 只出现一次的数字
 */
public class Demo136 {
    public static int singleNumber(int[] nums) {
        //任何数和0 做异或运算，结果仍然是原来的数，即 a⊕0=a。
        //任何数和其自身做异或运算，结果是0，即 a⊕a=0。
        //异或运算满足交换律和结合律，即 a⊕b⊕a=b⊕a⊕a=b⊕(a⊕a)=b⊕0=b。
        int single = 0;
        for (int num : nums) {
            single ^= num;
        }
        return single;
    }

    public static void main(String[] args) {
        int[] arr ={1,2,3,4,1,2,3,};
        int i = singleNumber(arr);
        System.out.println(i);
    }
}
