package org.sunny.leetcode.mid;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName LetterCombinations
 * @Description: 17 电话号码的字母组合
 * @Author sunzhen
 * @Date 2020/3/31
 * @Version V1.0
 **/
public class LetterCombinations {
    Map<String, String> mapper = new HashMap<>();
    List<String> res = new ArrayList<>();
    String tmp = "";

    public List<String> letterCombinations(String digits) {
        mapper.put("2", "abc");
        mapper.put("3", "def");
        mapper.put("4", "ghi");
        mapper.put("5", "jkl");
        mapper.put("6", "mno");
        mapper.put("7", "pqrs");
        mapper.put("8", "tuv");
        mapper.put("9", "wxyz");
        backTrace(digits, 0);
        return res;
    }

    public void backTrace(String nums, int index) {
        if (index >= nums.length()) {
            res.add(tmp);
            return;
        }
        String current = nums.substring(index, index + 1);
        String str = mapper.get(current);
        for (int i = 0; i < str.length(); i++) {
            tmp = tmp.concat(str.substring(i, i + 1));
            backTrace(nums, index + 1);
            tmp = tmp.substring(0, tmp.length() - 1);
        }
    }

}
