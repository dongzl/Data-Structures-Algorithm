package com.leetcode.solution.linkedlist;

/**
 * @author dongzonglei
 * @description
 * @date 2020/2/10 下午9:57
 */
public class ReverseLinkedList {
    
    class ListNode {
        int val;
        ListNode next;
        
        public ListNode(int val) {
            this.val = val;
        }
    }
    
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode p = reverseList(head.next);
        head.next.next = head;
        //head.next = null;
        return p;
    }
    
    ListNode createListNode() {
        ListNode head = new ListNode(1);
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(3);
        ListNode l3 = new ListNode(4);
        head.next = l1;
        l1.next = l2;
        l2.next = l3;
        return head;
    }
    
    public static void main(String args[]) throws Exception {
        ReverseLinkedList list = new ReverseLinkedList();
        ListNode head = list.createListNode();
        System.out.println(list.reverseList(head).val);
    }
}
