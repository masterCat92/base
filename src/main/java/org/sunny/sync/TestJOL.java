package org.sunny.sync;

import org.openjdk.jol.info.ClassLayout;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName TestJOL 用于测试JOL
 * @Description: TODO
 * @Author sunzhen
 * @Date 2020/5/17
 * @Version V1.0
 **/
public class TestJOL {
    private int i;
    private int j;

    public static void main(String args[]) {
        ExecutorService e = Executors.newFixedThreadPool(2);
        TestJOL testJOL = new TestJOL();
        System.out.println(ClassLayout.parseInstance(testJOL).toPrintable());
    }
}
