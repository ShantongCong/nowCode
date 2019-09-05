package com.cong;

import org.junit.Test;

import java.util.ArrayList;

public class Demo12 {
    @Test
    public void test01() {
        //输入一个链表，输出该链表中倒数第k个结点。
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        l2.next = l1;
        ListNode l3 = new ListNode(3);
        l3.next = l2;
        ListNode l4 = new ListNode(4);
        l4.next = l3;
        ListNode l5 = new ListNode(5);
        l5.next = l4;
        ListNode head = new ListNode(6);
        head.next = l5;
        ListNode node = FindKthToTail(head, 6);
        System.out.println(node.val);
    }

    public ListNode FindKthToTail1(ListNode head, int k) {

        ArrayList<ListNode> list = new ArrayList<>();
        ListNode node = head;
        list.add(head);
        while (node.next != null) {
            node = node.next;
            list.add(node);
        }
        if (k > list.size() || k < 1) {
            return null;
        }
        return list.get(list.size() - k);
    }

    //不可以使用Arraylist
    public ListNode FindKthToTail(ListNode head, int k) {
        if (k < 1||head==null) return null;

        ListNode pre=null;
        ListNode bi=null;
        pre = head;
        for (int i = 0; i < k - 1; i++) {
            pre = pre.next;

            if (pre == null)
                return null;
        }
        bi = head;
        while (pre.next != null) {
            pre = pre.next;
            bi = bi.next;
        }
        return bi;
    }
}
