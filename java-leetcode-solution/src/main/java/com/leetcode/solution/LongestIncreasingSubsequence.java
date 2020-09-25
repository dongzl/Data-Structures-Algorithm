package com.leetcode.solution;

/**
 * @author dongzonglei
 * @description
 * @date 2020/2/24 下午6:04
 */
public class LongestIncreasingSubsequence {
    
    public int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length <= 0) {
            return 0;
        }
        int res = 1;
        int[] dp = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            dp[i] = 1;
        }
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            res = Math.max(res, dp[i]);
        }
        return res;
    }
}
