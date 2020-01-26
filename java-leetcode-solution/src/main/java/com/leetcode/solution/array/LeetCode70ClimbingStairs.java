package com.leetcode.solution.array;

/**
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 *
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 *
 * 注意：给定 n 是一个正整数。
 *
 * 示例 1：
 *
 * 输入： 2
 * 输出： 2
 * 解释： 有两种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶
 * 2.  2 阶
 * 示例 2：
 *
 * 输入： 3
 * 输出： 3
 * 解释： 有三种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶 + 1 阶
 * 2.  1 阶 + 2 阶
 * 3.  2 阶 + 1 阶
 *
 */
public class LeetCode70ClimbingStairs {

    /**
     * 暴力求解法 递归
     * @param n
     * @return
     */
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    /**
     * 递归记忆法
     * @param n
     * @return
     */
    public int climbStairs2(int n) {
        int memo[] = new int[n + 1];
        return climb_Stairs2(n, memo);
    }

    public int climb_Stairs2(int n, int memo[]) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        if (memo[n] > 0) {
            return memo[n];
        }
        memo[n] = climb_Stairs2(n - 1, memo) + climb_Stairs2(n - 2, memo);
        return memo[n];
    }
}
