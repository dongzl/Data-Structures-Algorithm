package com.leetcode.solution;

import java.util.concurrent.LinkedTransferQueue;

/**
 * @author dongzonglei
 * @description
 * @date 2020/3/5 下午6:42
 */
public class FibonacciNumber {
    
    public int fib(int N) {
        double goldenRatio = (1 + Math.sqrt(5)) / 2;
        double goldenRatio1 = (1 - Math.sqrt(5)) / 2;
        return (int)Math.round((Math.pow(goldenRatio, N) - Math.pow(goldenRatio1, N))/ Math.sqrt(5));
    }
}
