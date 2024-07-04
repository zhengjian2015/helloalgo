package com.zhengj.jz24;

import com.zhengj.pub.ListNode;

/**
 *
 * 想错了， 牢记，temp 在循环里，并且，应该记录的是 cur.next,因为cur没啥好记的，我们把cur的next指向空了，就不知道它next
 * 是哪里了
 */

public class Solution1 {
    public static void main(String[] args) {

    }

    private ListNode reservtLinkNode(ListNode head) {
        ListNode cur = head;
        ListNode prev = null;
        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        return prev;
    }
}
