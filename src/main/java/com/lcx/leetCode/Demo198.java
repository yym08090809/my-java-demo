package com.lcx.leetCode;

/**
 * @author 李松柏
 * @createTime 2020/9/13 17:06
 * @description 打家劫舍
 * 你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
 * <p>
 * 给定一个代表每个房屋存放金额的非负整数数组，计算你 不触动警报装置的情况下 ，一夜之内能够偷窃到的最高金额。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：[1,2,3,1]
 * 输出：4
 * 解释：偷窃 1 号房屋 (金额 = 1) ，然后偷窃 3 号房屋 (金额 = 3)。
 *      偷窃到的最高金额 = 1 + 3 = 4 。
 * 示例 2：
 * <p>
 * 输入：[2,7,9,3,1]
 * 输出：12
 * 解释：偷窃 1 号房屋 (金额 = 2), 偷窃 3 号房屋 (金额 = 9)，接着偷窃 5 号房屋 (金额 = 1)。
 *      偷窃到的最高金额 = 2 + 9 + 1 = 12 。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/house-robber
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Demo198 {
    //动态规划
    //时间复杂度为O（n）   空间复杂度为O（n）
    public static int rob(int[] nums) {
        //房间为0或1时的返回情况
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return nums[0];
        }
        //创建数组保存状态
        int[] dp = new int[n];
        //初始化 dp[0]和dp[1]
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        //根据递推初始化
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }
        return dp[n - 1];
    }
    //动态规划 + 滚动数组
    //时间复杂度为O（n）   空间复杂度为O（1）
    public static int rob1(int[] nums) {
        //房间为0或1时的返回情况
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return nums[0];
        }
        //只维护前两个状态
        int first = nums[0];
        int second = Math.max(nums[0], nums[1]);
        //根据递推初始化
        for (int i = 2; i < n; i++) {
            //滚动数组维护状态
            int tmp = second;
            second = Math.max(second, first + nums[i]);
            first = tmp;
        }
        return second;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1};
        System.out.println(rob(arr));
        System.out.println(rob1(arr));
    }
}
