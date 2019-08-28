package com.cong;

public class ListNode {


    int val;
    ListNode next;   // 下一个链表对象

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    ListNode(int x) {
        val = x;
    }  //赋值链表的值

}
