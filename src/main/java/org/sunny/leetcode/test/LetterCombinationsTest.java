package org.sunny.leetcode.test;

import java.util.*;

/**
 * @ClassName LetterCombinations
 * @Description: TODO
 * @Author sunzhen
 * @Date 2020/3/29
 * @Version V1.0
 **/
public class LetterCombinationsTest {
    List<String> result = new ArrayList<>();
    Map<Character, char[]> digMap = new HashMap<>(8);
    String digits;
    StringBuilder tmp = new StringBuilder();
    List<Character> queue = new LinkedList<>();

    public LetterCombinationsTest() {
        digMap.put('2', new char[]{'a', 'b', 'c'});
        digMap.put('3', new char[]{'d', 'e', 'f'});
        digMap.put('4', new char[]{'g', 'h', 'i'});
        digMap.put('5', new char[]{'j', 'k', 'l'});
        digMap.put('6', new char[]{'m', 'n', 'o'});
        digMap.put('7', new char[]{'p', 'q', 'r', 's'});
        digMap.put('8', new char[]{'t', 'u', 'v'});
        digMap.put('9', new char[]{'w', 'x', 'y', 'z'});
    }


    public List<String> reslove(String digits) {
        char[] input = digits.toCharArray();
        backtrack2(input, 0);
        //backtrack2(input, ll);
        return result;
    }

    public void backtrack(char[] digits, int index) {
        if (index >= digits.length) {
            result.add(tmp.toString());
            return;
        }
        char[] dig = digMap.get(digits[index]);
        for (int i = 0; i < dig.length; i++) {
            tmp.append(dig[i]);
            backtrack(digits, index + 1);
            tmp.replace(tmp.length() - 1, tmp.length(), "");
        }
    }

    public void backtrack2(char[] digits, int index) {
        if (index >= digits.length) {
            StringBuilder sb = new StringBuilder();
            for (Character cs : queue) {
                sb.append(cs);
            }
            result.add(String.valueOf(sb));
            return;
        }
        char[] dig = digMap.get(digits[index]);
        for (int i = 0; i < dig.length; i++) {
            queue.add(dig[i]);
            backtrack2(digits, index + 1);
            queue.remove(queue.size() - 1);
        }
    }

}
