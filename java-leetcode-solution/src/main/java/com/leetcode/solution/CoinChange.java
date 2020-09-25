package com.leetcode.solution;

/**
 * @author dongzonglei
 * @description
 * @date 2020/2/24 下午6:21
 */
public class CoinChange {
    
    public int coinChange(int[] coins, int amount) {
        int max = amount + 1;
        int[] dp = new int[max];
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for(int j = 0; j < coins.length; j++) {
                if (coins[j] <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
    
    public static void main(String[] args) {
        CoinChange change = new CoinChange();
        System.out.println(change.coinChange(new int[]{1,2,5}, 11));
    }
}
