package com.leetcode.solution.stack;

/**
 * @author dongzonglei
 * @description
 * @date 2019-08-25 21:25
 */
public class MinStack {

    private int array[];

    private int size;

    private int currentMin;

    /** initialize your data structure here. */
    public MinStack() {
        array = new int[100];
        size = 0;
        currentMin = Integer.MAX_VALUE;
    }

    public void push(int x) {
        if (array.length == size) {
            int[] temp = new int[size * 2];
            for (int i = 0; i < size; i++) {
                temp[i] = array[i];
            }
            array = temp;
        }
        array[size] = x;
        if (x < currentMin) {
            currentMin = x;
        }
        size++;
    }

    public void pop() {
        if(array[size - 1] == currentMin) {
            currentMin = Integer.MAX_VALUE;
            for(int i = 0; i < size - 1; i++){
                if(array[i] < currentMin){
                    currentMin = array[i];
                }
            }
        }
        size--;
    }

    public int top() {
        return array[size - 1];
    }

    public int getMin() {
        return currentMin;
    }
}
