package com.leetcode.solution;

/**
 * @author dongzonglei
 * @description
 * @date 2020/2/23 下午4:03
 */
public class ValidPerfectSquare {
    
    public boolean isPerfectSquare(int num) {
        if (num == 0 || num == 1) {
            return true;
        }
        long i = 1, j = num;
        while (i <= j) {
            long x = (i + j);
            long m = x / 2;
            long temp = m * m;
            if (temp == num) {
                return true;
            } else if (temp > num) {
                j = m - 1;
            } else {
                i = m + 1;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        ValidPerfectSquare s = new ValidPerfectSquare();
        System.out.println(s.isPerfectSquare(2147483647));
    }
}
