package com.lcx.leetCode;

/**
 * 在一个 8 x 8 的棋盘上，有一个白色车（rook）。也可能有空方块，白色的象（bishop）和黑色的卒（pawn）。它们分别以字符 “R”，“.”，“B” 和 “p” 给出。大写字符表示白棋，小写字符表示黑棋。
 * <p>
 * 车按国际象棋中的规则移动：它选择四个基本方向中的一个（北，东，西和南），然后朝那个方向移动，直到它选择停止、到达棋盘的边缘或移动到同一方格来捕获该方格上颜色相反的卒。另外，车不能与其他友方（白色）象进入同一个方格。
 * <p>
 * 返回车能够在一次移动中捕获到的卒的数量。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/available-captures-for-rook
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Demo07 {
    public static int numRookCaptures(char[][] board) {
        int x = -1, y = -1, sum = 0;
        //获取R的坐标
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'R') {
                    x = i;
                    y = j;
                }
            }
        }
        //车上方的可以吃的棋子
        for (int i = x - 1; i >= 0; i--) {
            if (board[x][y] == 'p') {
                sum += 1;
            } else if (board[x][y] == 'B') {
                break;
            }
        }
        //车下方的可以吃的棋子
        for (int i = x+1 ; i < board.length; i++) {
            if (board[x][y] == 'p') {
                sum += 1;
                break;
            } else if (board[x][y] == 'B') {
                break;
            }
        }
        //车左方的可以吃的棋子
        for (int i = y - 1; i >= 0; i--) {
            if (board[x][y] == 'p') {
                sum += 1;
                break;
            } else if (board[x][y] == 'B') {
                break;
            }
        }
        //车右方的可以吃的棋子
        for (int i = y + 1; i < board[0].length; i++) {
            if (board[x][y] == 'p') {
                sum += 1;
                break;
            } else if (board[x][y] == 'B') {
                break;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        char[][] borad = {
                {'.','.','.','.','.','.','.','.'},
                {'.','P','P','P','P','P','.','.'},
                {'.','P','P','P','P','P','.','.'},
                {'.','P','P','R','P','P','.','.'},
                {'.','P','P','P','P','P','.','.'},
                {'.','P','P','P','P','P','.','.'},
                {'.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.'}};
        System.out.println(numRookCaptures(borad));
    }
}