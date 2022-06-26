package com.fun.grind;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        var list1 = new ListNode(3);
        var list2 = new ListNode(2);

        System.out.println(mergeTwoLists(list1, list2));
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        //This is a placeholder while the program complete operations
        var temporaryListNode = new ListNode(0);
        var currentNode = temporaryListNode;

        //Both lists cannot be null!
        while(list1 != null && list2 != null) {
            //The goal is to find the smaller value
            if (list1.val < list2.val) {
                currentNode.next = list1;
                list1 = list1.next;
            }
            else {
                currentNode.next = list2;
                list2 = list2.next;
            }

            currentNode = currentNode.next;
        }

        //Edge cases in case one list is null
        if (list1 != null) {
            currentNode.next = list1;
            list1 = list1.next;
        }

        if (list2 != null) {
            currentNode.next = list2;
            list2 = list2.next;
        }

        return temporaryListNode.next;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
