package com.lcx.leetCode;

/**
 * 在 N * N 的网格上，我们放置一些 1 * 1 * 1  的立方体。
 * <p>
 * 每个值 v = grid[i][j] 表示 v 个正方体叠放在对应单元格 (i, j) 上。
 * <p>
 * 请你返回最终形体的表面积。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：[[2]]
 * 输出：10
 * 示例 2：
 * <p>
 * 输入：[[1,2],[3,4]]
 * 输出：34
 * 示例 3：
 * <p>
 * 输入：[[1,0],[0,2]]
 * 输出：16
 * 示例 4：
 * <p>
 * 输入：[[1,1,1],[1,0,1],[1,1,1]]
 * 输出：32
 * 示例 5：
 * <p>
 * 输入：[[2,2,2],[2,1,2],[2,2,2]]
 * 输出：46
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/surface-area-of-3d-shapes
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class SurfaceArea0f3DShapes {
//    public static int surfaceArea(int[][] grid) {
////        int n = grid.length, area = 0;
////        for (int i = 0; i < n; i++) {
////            for (int j = 0; j < n; j++) {
////                int level = grid[i][j];
////                if(level>0){
////                    // 一个柱体中：2个底面 + 所有的正方体都贡献了4个侧表面积
////                    area +=(level << 2) +2;
////                    // 减掉 i 与 i-1 相贴的两份表面积
////                    area -= i > 0? Math.min(level, grid[i - 1][j]) << 1: 0;
////                    // 减掉 j 与 j-1 相贴的两份表面积
////                    area -= j > 0? Math.min(level, grid[i][j - 1]) << 1: 0;
////                }
////
////            }
////        }
////        return area;
////    }


    public static void main(String[] args) {
        int[][] arr = {{1, 2}, {3, 4}};
        int area = surfaceArea(arr);
        System.out.println(area);
    }

    public static int surfaceArea(int[][] grid) {
        int len = grid.length;
        int i, j, sum = 0;
        for (i = 0; i < len; i++) {
            for (j = 0; j < len; j++) {
                sum += grid[i][j];//计算立方体个数
            }
        }
        sum *= 6;//计算立方体所有的面
        for (j = 0; j < len; j++) {
            for (i = 1; i < len; i++) {
                sum -= Math.min(grid[i][j], grid[i - 1][j]) * 2; //减去左右方向重叠的两个面
            }
        }
        for (i = 0; i < len; i++) {
            for (j = 1; j < len; j++) {
                sum -= Math.min(grid[i][j], grid[i][j - 1]) * 2;//减去前后方向重叠的两个面
            }
        }
        for (i = 0; i < len; i++) {
            for (j = 0; j < len; j++) {
                if (grid[i][j] > 1) {
                    sum -= (grid[i][j] - 1) * 2;//减去上下方向重叠的两个面
                }
            }
        }
        return sum;
    }
}

