package com.lcx.leetCode;

import java.sql.SQLOutput;
import java.util.Arrays;

/**
 * @author 李松柏
 * @createTime 2020/7/26 17:36
 * @description 合并两个有序数组
 * 给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
 * 说明:
 *
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。
 * 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
 *  
 *
 */
public class Demo88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        /**
         * arraycopy()
         * src：要复制的数组(源数组)
         *
         *     srcPos：复制源数组的起始位置
         *
         *     dest：目标数组
         *
         *     destPos：目标数组的下标位置
         *
         *     length：要复制的长度
         */
        System.arraycopy(nums2,0,nums1,m,n);
        Arrays.sort(nums1);
        for (int i : nums1) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        merge(nums1,3,nums2,3);
    }

}
