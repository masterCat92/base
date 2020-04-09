package org.sunny.leetcode.easy;

/**
 * @ClassName MaxSubArray
 * @Description: 53. 最大子序和
 * @Author sunzhen
 * @Date 2020/4/9
 * @Version V1.0
 **/
public class MaxSubArray {

    //贪心算法
    public int maxSubArray(int[] nums) {
        int curr = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            curr = Math.max(curr + nums[i], nums[i]);
            max = Math.max(max, curr);
        }
        return max;
    }

    //dp算法
    public int maxSubArray2(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > 0) {
                nums[i] = nums[i - 1] + nums[i];
            }
            max = Math.max(max, nums[i]);
        }
        return max;
    }
}
