package org.sunny.leetcode.mid;

/**
 * @ClassName LengthOfLIS
 * @Description: 300. 最长上升子序列
 * @Author sunzhen
 * @Date 2020/4/1
 * @Version V1.0
 **/
public class LengthOfLIS {

    public int lengthOfLIS(int[] nums) {
        if(nums.length<=0){
            return 0;
        }
        int[] dp = new int[nums.length];
        int max = 0;
        dp[0] = 1;
        for (int i = 0; i < dp.length; i++) {
            int curr = 0;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    curr = Math.max(curr, dp[j]);
                }
            }
            dp[i] = curr + 1;
            max = Math.max(max, dp[i]);
        }
        return max;
    }

}
