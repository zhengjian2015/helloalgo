package com.zhengj.jz23;

import com.zhengj.pub.ListNode;

/**
 *
 * 链表中是否有环
 *
 * 快慢指针，如果有环，它们总会相遇的
 *
 *
 * 思路是没问题的， 但是快指针不是领先一步，而是每次走两步，慢指针每次走一步
 */
public class Solution1 {

    public static void main(String[] args) {

    }

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

}
