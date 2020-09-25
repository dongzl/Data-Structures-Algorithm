package com.leetcode.solution;

/**
 * @author dongzonglei
 * @description
 * @date 2020/3/3 下午10:00
 */
public class AddTwoNumbers {
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode first = l1;
        ListNode second = l2;
        ListNode current = dummyHead;
        int carry = 0;
        while (first != null || second != null) {
            int firstVal = (first != null) ? first.val : 0;
            int secondVal = (second != null) ? second.val : 0;
            int sum = carry + firstVal + secondVal;
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
            first = first != null ? first.next : null;
            second = second != null ? second.next : null;
        }
        if (carry > 0) {
            current.next = new ListNode(carry);
        }
        return dummyHead.next;
    }
    
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
    
        AddTwoNumbers s = new AddTwoNumbers();
        s.addTwoNumbers(l1, l2);
    }
}
