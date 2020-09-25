package com.leetcode.solution;

/**
 * @author dongzonglei
 * @description
 * @date 2020/2/23 下午6:20
 */
public class PowerOfTwo {
    
    public boolean isPowerOfTwo(int n) {
        if (n == 0) {
            return true;
        }
        n = n & (n - 1);
        return n == 0;
    }
    
    public static void main(String[] args) {
        PowerOfTwo o = new PowerOfTwo();
        System.out.println(o.isPowerOfTwo(0));
    }
}
