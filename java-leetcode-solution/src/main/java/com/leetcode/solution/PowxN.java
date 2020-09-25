package com.leetcode.solution;

/**
 * @author dongzonglei
 * @description
 * @date 2020/2/19 下午4:57
 */
public class PowxN {
    
    public static double myPow(double x, int n) {
        long N = n;
        if (n < 0) {
            x = 1 / x;
            N = -N;
        }
        return fastPow(x, N);
    }
    
    private static double fastPow(double x, long n) {
        if (n == 0) {
            return 1.0;
        }
        double half = fastPow(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }
    
    public static void main(String[] args) {
//        System.out.println(myPow(Double.valueOf("2.0"), -2));
        System.out.println(myPow(Double.valueOf("0.00001"), 2147483647));
    }
}
