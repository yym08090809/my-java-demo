package com.lcx.leetCode;

/**
 * @author 李松柏
 * @createTime 2020/7/26 17:23
 * @description 删除排序链表中的重复元素
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次
 */
public class Demo83 {
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode node = head;
        while (node != null && node.next !=null){
            if(node.val == node.next.val){
                node.next = node.next.next;
            }else {
                node =node.next;
            }
        }
        return head;
    }
}
