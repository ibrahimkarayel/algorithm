package com.pironix.leetcode.cycle;

/**
 * Created by ikarayel on 3/28/2017.
 */
public class CycleLinkedList {

    static class ListNode {
        int value;
        ListNode next;

        public ListNode(int value) {
            this.value = value;
            next = null;
        }

    }

    private static boolean isCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
