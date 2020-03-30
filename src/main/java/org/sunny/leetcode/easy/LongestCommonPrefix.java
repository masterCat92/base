package org.sunny.leetcode.easy;

/**
 * @ClassName LongestCommonPrefix
 * @Description: 14. 最长公共前缀
 * @Author sunzhen
 * @Date 2020/3/30
 * @Version V1.0
 **/
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";
        String head = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(head)) {
                head = head.substring(0, head.length() - 1);
            }
        }
        return head;
    }
}
