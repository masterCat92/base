package org.sunny.leetcode.mid;

/**
 * @ClassName ZConvert
 * @Description: 6. Z 字形变换
 * @Author sunzhen
 * @Date 2020/3/28
 * @Version V1.0
 **/
public class ZConvert {
    public String convert(String s, int numRows) {
        if(numRows==1)
            return s;
        else{
            int realNum=2*numRows-2;
            char[] cs=s.toCharArray();
            int maxlen=2*cs.length/realNum+1;
            char[] op=new char[numRows*maxlen];
            for(int i=0;i<cs.length;i++){
                int pr=i%realNum;
                int ri=i/realNum*2;
                if(pr>=numRows){
                    pr=realNum-pr;
                    ri++;
                }
                op[pr*maxlen+ri]=cs[i];
            }
            String res=String.valueOf(op);
            return res.replace("\0","");
        }
    }
}
