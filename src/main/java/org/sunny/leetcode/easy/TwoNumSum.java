package org.sunny.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName TwoNumSum
 * @Description: 1. 两数之和
 * @Author sunzhen
 * @Date 2020/3/30
 * @Version V1.0
 **/
public class TwoNumSum {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                res[0] = map.get(target - nums[i]);
                res[1] = i;
                return res;
            } else {
                map.put(nums[i], i);
            }
        }
        return null;
    }
}
