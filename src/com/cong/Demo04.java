package com.cong;

import java.util.ArrayList;


public class Demo04 {
    public static void main(String[] args) {

        ListNode l1=new ListNode(1);
        ListNode l2=new ListNode(2);
        ListNode l3=new ListNode(3);
        ListNode l4=new ListNode(4);
        ListNode l5=new ListNode(5);
        ArrayList<Integer> list = printListFromTailToHead(l5);
        System.out.println(list);
        //输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
    }
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();
        while (listNode!=null){
            list.add(listNode.val);
            listNode=listNode.next;
        }
        for (int i = 0; i < list.size(); i++) {
            list1.add(list.get(list.size()-1-i));
        }
        return list1;
    }
}
