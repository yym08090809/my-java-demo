package com.lcx.leetCode;

public class Demo26 {
    public int removeDuplicates(int[] nums) {
        //判空处理
        if (nums == null || nums.length == 0) return 0;
        //双指针，p前q后，若相等则q后移一位，若不相等则q位置元素复制至p+1位置上，然后 p q同时后移一位
        int p = 0,q = 1;
        while (q < nums.length) {
            if (nums[p] != nums[q]) {
                nums[p+1] = nums[q];
                p++;
            }
                q++;
        }
        return p + 1;
    }


    public static void main(String[] args) {
        Demo26 test = new Demo26();
        int[] nums = {1,1,2,2,3,3,4,4,5,6,7};
        int re = test.removeDuplicates(nums);
        System.out.println(re);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }
}
