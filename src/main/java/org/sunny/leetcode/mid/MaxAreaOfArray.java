package org.sunny.leetcode.mid;

/**
 * @ClassName MaxAreaOfArray
 * @Description: 11. 盛最多水的容器
 * @Author sunzhen
 * @Date 2020/3/28
 * @Version V1.0
 **/
public class MaxAreaOfArray {
    public int maxArea(int[] height) {
        int st=0;
        int et=height.length-1;
        int max=0;
        while(st<et){
            int area=Math.min(height[et],height[st])*(et-st);
            max=Math.max(max,area);
            if(height[et]>height[st])
                st++;
            else
                et--;
        }
        return max;
    }
}
