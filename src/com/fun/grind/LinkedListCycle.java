package com.fun.grind;
import com.fun.grind.MergeTwoSortedLists.ListNode;

public class LinkedListCycle {

    public static void main(String[] args) {
        var head = new ListNode(1);

        System.out.println(hasCycle(head));
    }

    protected static boolean hasCycle(ListNode head) {
        if (head==null) return false;

        ListNode slow = head;
        ListNode fast = head.next;

        //Slow moves one at a time.
        //Fast moves two at a time.
        while (slow != fast) {

            if (fast == null || fast.next == null) return false;

            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}
