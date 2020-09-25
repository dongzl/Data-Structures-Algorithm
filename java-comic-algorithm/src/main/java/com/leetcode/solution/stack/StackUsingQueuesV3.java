package com.leetcode.solution.stack;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author dongzonglei
 * @description
 * @date 2019-08-26 17:26
 */
public class StackUsingQueuesV3 {

    private Queue<Integer> q1 = new LinkedList<>();

    /** Initialize your data structure here. */
    public StackUsingQueuesV3() {
    }

    /** Push element x onto stack. */
    public void push(int x) {
        q1.add(x);
        int sz = q1.size();
        while (sz > 1) {
            q1.add(q1.remove());
            sz--;
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return q1.remove();
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
