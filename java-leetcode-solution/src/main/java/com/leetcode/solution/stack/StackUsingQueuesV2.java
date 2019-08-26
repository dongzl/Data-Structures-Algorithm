package com.leetcode.solution.stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author dongzonglei
 * @description
 * @date 2019-08-26 17:26
 */
public class StackUsingQueues {

    private Queue<Integer> q1 = new LinkedList<>();

    private Queue<Integer> q2 = new LinkedList<>();

    private int top;

    /** Initialize your data structure here. */
    public StackUsingQueues() {
    }

    /** Push element x onto stack. */
    public void push(int x) {
        q1.add(x);
        top = x;
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        while (q1.size() > 1) {
            top = q1.remove();
            q2.add(top);
        }
        int result = q1.remove();
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        return result;
    }

    /** Get the top element. */
    public int top() {
        return top;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q1.isEmpty();
    }
}
