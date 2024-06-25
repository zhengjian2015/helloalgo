package com.zhengj.jz22;

import com.zhengj.pub.ListNode;

/**
 *
 * https://leetcode.cn/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/
 * 链表中第K个节点
 *
 * 使用快慢指针
 *
 */
public class Solution1 {

    public static void main(String[] args) {

    }

    public ListNode trainingPlan(ListNode head, int cnt) {
        if(head == null) {
            return null;
        }
        if(cnt <= 0) return head;
        ListNode quick = head;
        ListNode slow = head;
        int k = 1;
        while (k <= cnt) {
            k++;
            quick = quick.next;
        }

        while (quick != null) {
            quick = quick.next;
            slow = slow.next;
        }

        return slow;
    }
}
