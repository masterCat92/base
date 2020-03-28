package org.sunny.leetcode.mid;

/**
 * @ClassName LongestSubstring
 * @Description: 3. 无重复字符的最长子串
 * @Author sunzhen
 * @Date 2020/3/28
 * @Version V1.0
 **/
public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int max=0,pt=0,curr=0;
        for(int i=0;i<s.length();i++){
            int index=s.substring(pt,i).indexOf(s.charAt(i));
            if(index>=0){
                curr=i-pt;
                max=max<curr?curr:max;
                pt=pt+index+1;
                curr=i-pt+1;
            }else
                curr++;
        }
        return max<curr?curr:max;
    }


}
