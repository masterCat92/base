package org.sunny.leetcode.view;

import java.util.concurrent.Semaphore;

/**
 * @ClassName ThreadAlternat 使用信号量多线程交替打印
 * @Description: TODO
 * @Author sunzhen
 * @Date 2020/7/7
 * @Version V1.0
 **/
public class ThreadAlternat {
    public static void main(String args[]) {
        Semaphore s1 = new Semaphore(1);
        Semaphore s2 = new Semaphore(0);

        Runnable run1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i += 2) {
                    try {
                        s1.acquire();
                        System.out.println(Thread.currentThread().getName() + ":" + i);
                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        s2.release();
                    }
                }
            }
        };

        Runnable run2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i < 100; i += 2) {
                    try {
                        s2.acquire();
                        System.out.println(Thread.currentThread().getName() + ":" + i);
                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        s1.release();
                    }
                }
            }
        };
        new Thread(run1).start();
        new Thread(run2).start();
    }
}
