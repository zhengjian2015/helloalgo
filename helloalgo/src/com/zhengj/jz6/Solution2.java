package com.zhengj.jz6;

import com.zhengj.pub.ListNode;

/**
 *
 * 既然用到了栈， 面试官就很可能让你用 递归，因为递归底本质是栈
 *
 * 递归代码简洁，但是鲁棒性不够好，当链表非常长的时候，调用层级很深，可能会导致栈溢出错误
 */
public class Solution2 {

    public void rePrintListNode(ListNode head) {
        if(head != null) {
            if(head.next != null) {
                rePrintListNode(head.next);
            }
            System.out.println(head.val);
        }
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(4);
        ListNode l2 = new ListNode(3);
        ListNode l3 = new ListNode(2);
        ListNode l4 = new ListNode(1);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        new Solution2().rePrintListNode(l1);
    }
}
