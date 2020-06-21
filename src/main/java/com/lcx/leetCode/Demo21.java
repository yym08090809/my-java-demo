package com.lcx.leetCode;

import javax.xml.soap.Node;

public class Demo21 {
    public static ListNode4 mergeTwoLists(ListNode4 l1, ListNode4 l2) {
        ListNode4 listNode4 = new ListNode4(-1);
        ListNode4 re = listNode4;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                re.next = l1;
                l1 = l1.next;
            }else {
                re.next = l2;
                l2 = l2.next;
            }
            re = re.next;
        }
        re.next = l1 == null ? l2 : l1;
        return listNode4.next;
    }

    public static void main(String[] args) {
        ListNode4 node = new ListNode4(1);
        ListNode4  node1= new ListNode4(2);
        ListNode4 node2 = new ListNode4(4);
        node.next = node1;
        node1.next = node2;

        ListNode4 nod = new ListNode4(1);
        ListNode4  nod1= new ListNode4(3);
        ListNode4 nod2 = new ListNode4(4);
        nod.next = nod1;
        nod1.next = nod2;

        ListNode4 node4 = mergeTwoLists(node, nod);
        while (node4.next != null){
            System.out.println(node4.val);
            node4 = node4.next;
        }
        System.out.println(node4.val);

    }
}
