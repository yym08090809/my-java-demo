package com.lcx.leetCode;

//实现 strStr() 函数。
public class Demo28 {
    public static int strStr(String haystack, String needle) {
        int n = needle.length();
        for (int i = 0; i < haystack.length()-n+1; ++i) {
            if(haystack.substring(i,i+n).equals(needle)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
//        String haystack = "hello";
//        String needle = "ll";
        String haystack = "";
        String needle = "";
        System.out.println(strStr(haystack,needle));
    }
}
