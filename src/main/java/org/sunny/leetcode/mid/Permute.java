package org.sunny.leetcode.mid;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Permute
 * @Description: 46. 全排列
 * @Author sunzhen
 * @Date 2020/4/2
 * @Version V1.0
 **/
public class Permute {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        List<Integer> tmp = new ArrayList<>();
        int[] vis = new int[nums.length];
        backTrace(nums, tmp, vis);
        return res;
    }

    public void backTrace(int[] nums, List<Integer> list, int[] vis) {
        if (list.size() == nums.length) {
            List<Integer> tmp = new ArrayList<>();
            tmp.addAll(list);
            res.add(tmp);
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (vis[i] == 1) {
                continue;
            }
            vis[i] = 1;//是否已经用的标签
            list.add(nums[i]);
            backTrace(nums, list, vis);
            list.remove(list.size() - 1);
            vis[i] = 0;
        }
    }
}
