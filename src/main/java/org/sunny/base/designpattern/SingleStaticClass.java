package org.sunny.base.designpattern;

/**
 * @ClassName SingleStaticClass 单例静态内部类
 * @Description: TODO
 * @Author sunzhen
 * @Date 2020/6/5
 * @Version V1.0
 **/
public class SingleStaticClass {
    private SingleStaticClass() {
    }

    private static class SingleHolder {
        private static final SingleStaticClass instant = new SingleStaticClass();
    }

    public static final SingleStaticClass getInstance(){
        return SingleHolder.instant;
    }
}
