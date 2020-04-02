package org.sunny.leetcode.mid;

/**
 * @ClassName LongestCommonSubsequence
 * @Description: 1143. 最长公共子序列
 * @Author sunzhen
 * @Date 2020/4/2
 * @Version V1.0
 * "lcnqdmvsdopkvqvejijcdyxetuzonuhuzkpelmva"
 * "bklgfivmpozinybwlovcnafqfybodkhabyrglsnen"
 * 未通过
 **/
@Deprecated
public class LongestCommonSubsequence {
    public int longestCommonSubsequenceSolve(String text1, String text2) {
        int[][] dp = new int[text1.length()][text2.length()];
        for (int i = 0; i < text1.length(); i++) {
            for (int j = 0; j < text2.length(); j++) {
                if (text2.charAt(j) == text1.charAt(i)) {
                    if (i == 0 && j == 0) {
                        dp[i][j] = 1;
                    } else if (i == 0) {
                        dp[i][j] = dp[i][j - 1] + 1;
                    } else if (j == 0) {
                        dp[i][j] = dp[i - 1][j] + 1;
                    } else {
                        dp[i][j] = dp[i - 1][j - 1] + 1;//i-1,j-1 实际上是上次相撞的值，这个值一直在往下传递
                    }
                } else {
                    if (i == 0 && j == 0) {
                        dp[i][j] = 0;
                    } else if (i == 0) {
                        dp[i][j] = dp[i][j - 1];
                    } else if (j == 0) {
                        dp[i][j] = dp[i - 1][j];
                    } else {
                        dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                    }
                }
            }
        }
        return dp[text1.length() - 1][text2.length() - 1];
    }
}
