package org.sunny.leetcode.self;

/**
 * @ClassName Palindromic 回文字符串，找最大回文长度
 * @Description: TODO
 * @Author sunzhen
 * @Date 2020/7/7
 * @Version V1.0
 **/
public class Palindromic {
    public static void main(String args[]) {
        String str = "";
        System.out.println(actPalind("bbab".getBytes()));
    }

    public static int actPalind(byte[] bytes) {
        int max = 0;
        for (int i = 0; i < bytes.length; i++) {
            int same = 1, p = 1;
            while (i + same < bytes.length - 1 && bytes[i + same] == bytes[i]) {
                same++;
            }
            same--;
            while (i - p > 0 && i + same + p < bytes.length  && bytes[i - p] == bytes[i + p]) {
                p++;
            }
            p--;
            max = Math.max(max, 1 + same + 2 * p);
            i = i + same;
        }
        return max;
    }
}
