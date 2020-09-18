package com.lcx.leetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 李松柏
 * @createTime 2020/9/11 13:53
 * @description 杨辉三角
 */
public class Demo118 {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> dp = new ArrayList<>();
        if(numRows == 0){
            return dp;
        }
        dp.add(new ArrayList<>());
        dp.get(0).add(1);
        //注意这里的 i 是指行数，但是dp是从0开始的
        //所以preRow是i-2
        for (int i = 2; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> preRow = dp.get(i - 2);
            row.add(1);
            for (int j = 1; j < i-1; j++) {
                row.add(preRow.get(j)+preRow.get(j-1));
            }
            row.add(1);
            dp.add(row);
        }
        return dp;
    }

    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> generate = generate(numRows);
        for (List<Integer> list : generate) {
            for (Integer integer : list) {
                System.out.print(integer+" ");
            }
            System.out.println();
        }
    }
}
