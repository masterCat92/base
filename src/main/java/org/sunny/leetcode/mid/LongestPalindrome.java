package org.sunny.leetcode.mid;

/**
 * @ClassName LongestPalindrome
 * @Description: 5. 最长回文子串
 * @Author sunzhen
 * @Date 2020/3/28
 * @Version V1.0
 **/
public class LongestPalindrome {
    public String longestPalindrome(String s) {
        char[] charArr=transChar(s);
        int[] len=new int[charArr.length];
        int R=-1,C=-1,maxlen=0,maxP=0;
        for(int i=0;i<charArr.length;i++){
            len[i]=(R>i)?Math.min(len[2*C-i],R-i+1):1;
            while(i+len[i]<charArr.length&&i-len[i]>-1){
                if(charArr[i-len[i]]==charArr[i+len[i]])
                    len[i]++;
                else
                    break;
            }
            if(i+len[i]>R){
                R=i+len[i]-1;
                C=i;
            }
            if(len[i]>maxlen){
                maxlen=len[i];
                maxP=i;
            }
        }
        String res=String.valueOf(charArr);
        return res.substring(maxP-maxlen+1,maxP+maxlen).replace("#","");
    }

    public char[] transChar(String str){
        char[] c=new char[str.length()*2+1];
        for(int i=0;i<c.length;i++){
            c[i]=(i%2==0)?'#':str.charAt(i/2);
        }
        return c;
    }

}
