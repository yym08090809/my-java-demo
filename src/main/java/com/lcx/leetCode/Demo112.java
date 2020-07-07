package com.lcx.leetCode;

public class Demo112 {
    public static boolean hasPathSum(TreeNode root, int sum) {
        int num = 0;
        if(root == null){
            return false;
        }
        if(root.val == sum && (root.left == null && root.right == null)){
            return true;
        }else {
            return hasPathSum(root.left,sum-root.val)||hasPathSum(root.right,sum-root.val);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        boolean b = hasPathSum(root, 0);
        System.out.println(b);
    }
}
