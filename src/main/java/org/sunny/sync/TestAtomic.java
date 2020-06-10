package org.sunny.sync;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName TestAtomic
 * @Description: TODO
 * @Author sunzhen
 * @Date 2020/5/17
 * @Version V1.0
 **/
public class TestAtomic {

    private static AtomicInteger atomicInteger = new AtomicInteger(0);

    public static void main(String args[]) throws InterruptedException {
        Thread[] threads = new Thread[100];
        CountDownLatch latch = new CountDownLatch(threads.length);
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < 10000; j++) {
                    atomicInteger.incrementAndGet();
                }
                latch.countDown();
            });
            Arrays.stream(threads).forEach((t) -> t.start());
            latch.await();
            System.out.println(atomicInteger);
        }
    }
}

