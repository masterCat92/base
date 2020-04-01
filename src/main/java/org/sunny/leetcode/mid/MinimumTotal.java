package org.sunny.leetcode.mid;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName MinimumTotal
 * @Description: 120. 三角形最小路径和
 * @Author sunzhen
 * @Date 2020/4/1
 * @Version V1.0
 **/
public class MinimumTotal {

    public static void main(String[] args) {
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        l1.add(2);
        triangle.add(l1);

        List<Integer> l2 = new ArrayList<>();
        l2.add(3);
        l2.add(4);
        triangle.add(l2);

        List<Integer> l3 = new ArrayList<>();
        l3.add(6);
        l3.add(5);
        l3.add(7);
        triangle.add(l3);

        List<Integer> l4 = new ArrayList<>();
        l4.add(4);
        l4.add(1);
        l4.add(8);
        l4.add(3);
        triangle.add(l4);

        MinimumTotal m = new MinimumTotal();

        System.out.println(m.minimumTotal(triangle));
    }

    //倒三角解决
    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle.size() == 0) {
            return 0;
        }
        List<Integer> path = new ArrayList<>();
        path.addAll(triangle.get(triangle.size() - 1));
        for (int i = triangle.size() - 1 - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                int cos = Math.min(path.get(j), path.get(j + 1));
                path.set(j, cos + triangle.get(i).get(j));
            }
        }
        return path.get(0);
    }
}
