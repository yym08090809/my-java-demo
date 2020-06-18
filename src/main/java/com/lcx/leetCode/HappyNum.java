package com.lcx.leetCode;

/**
 * 编写一个算法来判断一个数 n 是不是快乐数。
 * 快乐数」定义为：对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和，
 * 然后重复这个过程直到这个数变为 1，也可能是 无限循环 但始终变不到 1。如果 可以变为  1，那么这个数就是快乐数。
 */
public class HappyNum {
    public static boolean isHappy(int n) {
        //使用快慢指針，慢指针每次执行一次，快指针每次执行两次
        int slow = n, fast;
        slow = getsum(slow);
        fast = getsum(slow);
        //我们不是只跟踪链表中的一个值，而是跟踪两个值，称为快跑者和慢跑者。在算法的每一步中，慢速在链表中前进 1 个节点，快跑者前进 2 个节点（对 getsum(n) 函数的嵌套调用）。
        //
        //如果 n 是一个快乐数，即没有循环，那么快跑者最终会比慢跑者先到达数字 1。
        //
        //如果 n 不是一个快乐的数字，那么最终快跑者和慢跑者将在同一个数字上相遇。

        while (fast != 1 && slow != fast) {
            slow = getsum(slow);
            fast = getsum(getsum(fast));
        }
        return fast == 1;
    }

    /**
     * 获取下一个各个位数平方和的结果
     *
     * @param n
     * @return
     */
    private static int getsum(int n) {
        int sum = 0;
        while (n > 0) {
            int temp = n % 10;
            n /= 10;
            sum += temp * temp;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(20));
    }
}
