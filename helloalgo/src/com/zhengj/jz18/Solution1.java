package com.zhengj.jz18;

import com.zhengj.pub.ListNode;

/**
 *
 * 删除链表的节点
 *
 * 力扣，lcr 136
 */
public class Solution1 {
    public ListNode deleteNode(ListNode head, int val) {
        if(head == null) {
            return null;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = dummy;
        while (pre.next != null) {
            ListNode delNode = pre.next;
            if(delNode.val == val) {
                pre.next = delNode.next;
            } else {
                pre = pre.next;
            }
        }
        return dummy.next;
    }


}
