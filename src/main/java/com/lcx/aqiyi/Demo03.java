package com.lcx.aqiyi;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author 李松柏
 * @createTime 2020/9/13 15:32
 * @description 最长字串
 */
public class Demo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(MaxLengthString(s));
    }

    private static int MaxLengthString(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int res = 0,i = -1;
        for (int j = 0; j < s.length(); j++) {
            if(map.containsKey(s.charAt(j))){
                i = Math.max(i,map.get(s.charAt(j)));
            }
            map.put(s.charAt(j),j);
            res=Math.max(res,j-i);
        }
        return res;
    }
}
