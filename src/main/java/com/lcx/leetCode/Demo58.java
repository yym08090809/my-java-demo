package com.lcx.leetCode;

public class Demo58 {
    public static int lengthOfLastWord(String s) {
            String[] words = s.split(" ");
            if(words.length==0) return 0;
            else
                return words[words.length - 1].length();
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("hello world"));;
    }
}
