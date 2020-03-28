package org.sunny.leetcode.mid;

/**
 * @ClassName MinPathSum
 * @Description: 64. 最小路径和
 * @Author sunzhen
 * @Date 2020/3/28
 * @Version V1.0
 **/
public class MinPathSum {
    public int minPathSum(int[][] grid) {
        int row = grid.length - 1;
        int col = grid[0].length - 1;
        return f_dp(grid, row, col);
    }

    //超时了
    //原因在于递归没有记下这个值，。导致复杂的重复运算
    public int f_dp(int[][] grid, int i, int j) {
        if (i > 0 && j > 0) {
            return Math.min(f_dp(grid, i - 1, j), f_dp(grid, i, j - 1)) + grid[i][j];
        } else if (i == 0 && j > 0) {
            return grid[i][j] + f_dp(grid, i, j - 1);
        } else if (i > 0 && j == 0) {
            return grid[i][j] + f_dp(grid, i - 1, j);
        } else
            return grid[0][0];
    }

    public int dp_cos(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (i == 0 && j == 0) {
                    continue;
                } else if (i == 0) {
                    grid[0][j] = grid[0][j - 1] + grid[0][j];
                } else if (j == 0) {
                    grid[i][0] = grid[i - 1][0] + grid[i][0];
                } else {
                    grid[i][j] = Math.min(grid[i - 1][j], grid[i][j - 1]) + grid[i][j];
                }
            }
        }
        return grid[grid.length - 1][grid[0].length - 1];
    }

}
