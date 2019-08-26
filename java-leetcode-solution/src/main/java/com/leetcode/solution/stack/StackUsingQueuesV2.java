package com.leetcode.solution.stack;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author dongzonglei
 * @description
 * @date 2019-08-26 17:26
 */
public class StackUsingQueuesV2 {

    private Queue<Integer> q1 = new LinkedList<>();

    private Queue<Integer> q2 = new LinkedList<>();

    private int top;

    /** Initialize your data structure here. */
    public StackUsingQueuesV2() {
    }

    /** Push element x onto stack. */
    public void push(int x) {
        q2.add(x);
        top = x;
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }
        Queue<Integer> temp = q2;
        q2 = q1;
        q1 = temp;
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        int result = q1.remove();
        if (!q1.isEmpty()) {
            top = q1.peek();
        }
        return result;
    }

    /** Get the top element. */
    public int top() {
        return q1.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q1.isEmpty();
    }
}
