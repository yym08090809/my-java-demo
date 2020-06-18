package com.lcx.leetCode;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * <p>
 * 如果不存在公共前缀，返回空字符串 ""。
 */
public class Demo14 {

//public String longestCommonPrefix(String[] strs) {
//    if (strs == null || strs.length == 0) return "";
//    return longestCommonPrefix(strs, 0 , strs.length - 1);
//}
//
//    private String longestCommonPrefix(String[] strs, int l, int r) {
//        if (l == r) {
//            return strs[l];
//        }
//        else {
//            int mid = (l + r)/2;
//            String lcpLeft =   longestCommonPrefix(strs, l , mid);
//            String lcpRight =  longestCommonPrefix(strs, mid + 1,r);
//            return commonPrefix(lcpLeft, lcpRight);
//        }
//    }
//
//    String commonPrefix(String left,String right) {
//        int min = Math.min(left.length(), right.length());
//        for (int i = 0; i < min; i++) {
//            if ( left.charAt(i) != right.charAt(i) )
//                return left.substring(0, i);
//        }
//        return left.substring(0, min);
//    }
public String longestCommonPrefix(String[] strs) {
    if(strs.length == 0)
        return "";
    String ans = strs[0];
    for(int i =1;i<strs.length;i++) {
        int j=0;
        for(;j<ans.length() && j < strs[i].length();j++) {
            if(ans.charAt(j) != strs[i].charAt(j))
                break;
        }
        ans = ans.substring(0, j);
        if(ans.equals(""))
            return ans;
    }
    return ans;
}

    public static void main(String[] args) {
        String[] s = {"abc","abc","cab","cab"};
        System.out.println(new Demo14().longestCommonPrefix(s));
    }
}
