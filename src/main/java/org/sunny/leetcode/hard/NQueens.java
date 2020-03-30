package org.sunny.leetcode.hard;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName NQueens
 * @Description: 51. N皇后
 * @Author sunzhen
 * @Date 2020/3/30
 * @Version V1.0
 *
 * 执行用时 :
 * 4 ms
 * , 在所有 Java 提交中击败了
 * 70.62%
 * 的用户
 * 内存消耗 :
 * 39.7 MB
 * , 在所有 Java 提交中击败了
 * 17.91%
 * 的用户
 **/
public class NQueens {
    public List<List<String>> res = new ArrayList<>();
    StringBuilder sb = new StringBuilder();

    public List<List<String>> solveNQueens(int n) {
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            sb.append(".");
        }

        return res;
    }

    public boolean is_CanUse(int[] ans, int row, int col) {
        for (int i = 0; i < row; i++) {
            if ((col == ans[i]) || (i + ans[i]) == row + col || (i - ans[i]) == row - col)
                return false;
        }
        return true;
    }

    public void backTrace(int[] ans, int row, int num) {
        if (row == num) {
            addResList(ans);
            return;
        }
        for (int col = 0; col < num; col++) {
            if (is_CanUse(ans, row, col)) {
                ans[row] = col;
                backTrace(ans, row + 1, num);
            }
        }
    }

    public void addResList(int[] ans) {
        List<String> ans_n = new ArrayList<>();
        for (int i = 0; i < ans.length; i++) {
            StringBuilder sr=new StringBuilder(sb);
            ans_n.add(sr.replace(ans[i],ans[i]+1,"Q").toString());
        }
        res.add(ans_n);
    }
}
