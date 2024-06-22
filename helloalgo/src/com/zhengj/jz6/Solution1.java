package com.zhengj.jz6;

import com.zhengj.pub.ListNode;

import javax.swing.event.ListDataListener;
import java.util.List;
import java.util.Stack;

/**
 * 从尾到头打印链表
 *
 * 剑指offer第6题， 从尾到头，就是先进后出，要首先想到链表
 *
 *
 */
public class Solution1 {
    public void rePrintListNode(ListNode head) {
        if(head == null) {
            return;
        }
        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            stack.add(head.val);
            head = head.next;
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }


    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        new Solution1().rePrintListNode(l1);
    }
}
