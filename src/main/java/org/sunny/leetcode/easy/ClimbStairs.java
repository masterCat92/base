package org.sunny.leetcode.easy;

/**
 * @ClassName ClimbStairs
 * @Description: 70. 爬楼梯
 * @Author sunzhen
 * @Date 2020/4/2
 * @Version V1.0
 **/
public class ClimbStairs {
    public int climbStairsSolve(int n) {
        if (n == 0) {
            return 0;
        }
        int[] sum = new int[n + 1];
        sum[0] = 1;
        sum[1] = 1;
        for (int i = 2; i <= n; i++) {
            sum[i] = sum[i - 1] + sum[i - 2];
        }
        return sum[n];
    }
}
