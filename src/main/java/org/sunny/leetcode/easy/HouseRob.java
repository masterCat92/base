package org.sunny.leetcode.easy;

/**
 * @ClassName HouseRob
 * @Description: 198. 打家劫舍
 * @Author sunzhen
 * @Date 2020/4/9
 * @Version V1.0
 **/
public class HouseRob {
    public int rob(int[] nums) {
        int pre = 0, curr = 0;
        for (int i : nums) {
            int tmp = curr;
            curr = Math.max(pre + i, curr);
            pre = tmp;
        }
        return curr;
    }
}
