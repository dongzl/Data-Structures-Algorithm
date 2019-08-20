package com.leetcode.solution.linkedlist;

/**
 * @author dongzonglei
 * @description
 *
 * Description
 * Given a singly linked list, determine if it is a palindrome.
 *
 * Follow up:
 *
 * Could you do it in O(n) time and O(1) space?
 *
 * https://github.com/andavid/leetcode-java/blob/master/note/234/README.md
 *
 * @date 2019-08-19 17:04
 */
public class PalindromeLinkedList {

    class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public Boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            ListNode next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }
        if (fast != null) {
            slow = slow.next;
        }
        while (slow != null) {
            if (slow.val != prev.val) {
                return false;
            }
            slow = slow.next;
            prev = prev.next;
        }
        return true;
    }

    ListNode createListNode() {
        ListNode head = new ListNode(1);
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(3);
        ListNode l3 = new ListNode(4);
        ListNode l4 = new ListNode(3);
        ListNode l5 = new ListNode(2);
        ListNode l6 = new ListNode(1);
        head.next = l1;
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        return head;
    }

    public static void main(String args[]) throws Exception {
        PalindromeLinkedList list = new PalindromeLinkedList();
        ListNode head = list.createListNode();
        System.out.println(list.isPalindrome(head));
    }
}
