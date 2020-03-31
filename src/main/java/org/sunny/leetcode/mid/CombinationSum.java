package org.sunny.leetcode.mid;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName CombinationSum
 * @Description: TODO
 * @Author sunzhen
 * @Date 2020/3/31
 * @Version V1.0
 **/
public class CombinationSum {

    public List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> list = new ArrayList<>();
        backTrace(candidates, 0, target, list);
        return res;
    }

    public void backTrace(int[] cad, int index, int rem, List<Integer> list) {
        if (index >= cad.length || rem < 0) {
            return;
        }
        if (rem == 0) {
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = index; i < cad.length; i++) {
            list.add(cad[i]);
            rem = rem - cad[i];
            backTrace(cad, i, rem, list);
            rem = rem + cad[i];
            list.remove(list.size() - 1);
        }
    }

}

