package org.sunny.leetcode.mid;

/**
 * @ClassName UniquePathsPlus
 * @Description: 63. 不同路径 II
 * @Author sunzhen
 * @Date 2020/4/2
 * @Version V1.0
 **/
public class UniquePathsPlus {
/*    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;

        if (obstacleGrid[0][0] == 1 || obstacleGrid[row - 1][col - 1] == 1) {
            return 0;
        }

        int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];
        if (obstacleGrid[1][0] == 1) {
            dp[1][0] = 0;
        } else {
            dp[1][0] = 1;
        }
        if (obstacleGrid[0][1] == 1) {
            dp[0][1] = 0;
        } else {
            dp[0][1] = 1;
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = 0;
                } else if (i == 0 && j > 0) {
                    if (obstacleGrid[i][j] == 1) {
                        dp[i][j] = 0;
                    } else {
                        dp[i][j] = dp[i][j - 1];
                    }
                } else if (i > 0 && j == 0) {
                    if (obstacleGrid[i][j] == 1) {
                        dp[i][j] = 0;
                    } else {
                        dp[i][j] = dp[i - 1][j];
                    }
                } else {
                    if (obstacleGrid[i][j] == 1) {
                        dp[i][j] = 0;
                    } else {
                        dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                    }
                }
            }
        }
        return dp[row - 1][col - 1];
    }*/

    public int uniquePathsWithObstacles2(int[][] obstacleGrid) {
        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;
        if (obstacleGrid[0][0] == 1 || obstacleGrid[row - 1][col - 1] == 1) {
            return 0;
        }
        int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (obstacleGrid[i][j] == 1) {
                    dp[i][j] = 0;
                } else {
                    if (i == 0 && j == 0) {
                        dp[i][j] = 1;
                    } else if (i == 0 && j > 0) {
                        dp[i][j] = dp[i][j - 1];
                    } else if (j == 0 && i > 0) {
                        dp[i][j] = dp[i - 1][j];
                    } else {
                        dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                    }
                }
            }
        }
        return dp[row - 1][col - 1];
    }
}
