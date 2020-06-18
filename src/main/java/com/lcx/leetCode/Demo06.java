package com.lcx.leetCode;

import java.util.Scanner;

/**
 * 回旋镖定义为一组三个点，这些点各不相同且不在一条直线上。
 * <p>
 * 给出平面上三个点组成的列表，判断这些点是否可以构成回旋镖。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：[[1,1],[2,3],[3,2]]
 * 输出：true
 * 示例 2：
 * <p>
 * 输入：[[1,1],[2,2],[3,3]]
 * 输出：false
 *  
 * <p>
 * 提示：
 * <p>
 * points.length == 3
 * points[i].length == 2
 * 0 <= points[i][j] <= 100
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-boomerang
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Demo06 {
    public static boolean isBoomerang(int[][] points) {
        return (points[1][1] - points[0][1]) * (points[2][0] - points[0][0]) != (points[2][1] - points[0][1]) * (points[1][0] - points[0][0]);
    }

//    public static boolean isBoomerang(int[][] points) {
//        int dx = points[1][0] - points[0][0];
//        int dy = points[1][1] - points[0][1];
//        int ex = points[2][0] - points[0][0];
//        int ey = points[2][1] - points[0][1];
//        return dx * ey != dy * ex;
//    }
    public static void main(String[] args) {
//        int[][] points = {{1,1},{2,3},{3,2}};
//        int[][] points = {{1, 1}, {2, 2}, {3, 3}};
        int[][] points = {{0, 0}, {1, 0}, {2, 2}};
        System.out.println(isBoomerang(points));
    }
}
