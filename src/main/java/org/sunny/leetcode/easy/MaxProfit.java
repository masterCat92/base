package org.sunny.leetcode.easy;

/**
 * @ClassName MaxProfit
 * @Description: 121. 买卖股票的最佳时机
 * @Author sunzhen
 * @Date 2020/4/9
 * @Version V1.0
 **/
public class MaxProfit {
    public int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                max = Math.max(prices[i] - prices[i - 1], max);
                prices[i] = prices[i - 1];
            }
        }
        return max;
    }
}
