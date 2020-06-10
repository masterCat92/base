package org.sunny.base.designpattern;

/**
 * @ClassName SingleDCLClass 单例模式-懒加载双重检锁
 * @Description: TODO
 * @Author sunzhen
 * @Date 2020/6/5
 * @Version V1.0
 **/
public class SingleDCLClass {
    private SingleDCLClass() { }

    private volatile static SingleDCLClass instance;

    public static SingleDCLClass getInstance() {
        if (null == instance) {
            synchronized (SingleDCLClass.class) {
                if (null == instance) {
                    instance = new SingleDCLClass();
                }
            }
        }
        return instance;
    }
}
