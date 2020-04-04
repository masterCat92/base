package org.sunny.leetcode.mid;

/**
 * @ClassName coinChange
 * @Description: 322. 零钱兑换
 * @Author sunzhen
 * @Date 2020/4/5
 * @Version V1.0
 **/
public class CoinChange {
    public int coinChangeRes(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            dp[i] = amount + 1;//这个值设置大一点，这样比较时就能淘汰掉
            for (int j = 0; j < coins.length; j++) {
                if (i >= coins[j]) {
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
}
