package org.sunny.base.data.structure;

import java.util.List;

/**
 * @ClassName ArrayQueue 数组队列的实现(附加标志位)
 * 如何判断环形队列为空，为满有两种判断方法。
 * 一.是附加一个标志位tag
 * 当head赶上tail，队列空，则令tag=0,
 * 当tail赶上head，队列满，则令tag=1,
 * <p>
 * 二.限制tail赶上head，即队尾结点与队首结点之间至少留有一个元素的空间。
 * 队列空：   head==tail
 * 队列满：   (tail+1)% MAXN ==head
 * @Description: TODO
 * @Author sunzhen
 * @Date 2020/4/19
 * @Version V1.0
 **/
public class ArrayQueue<T> {
    private int maxSiz;
    private int front;//初始0
    private int rear;//初始0
    private Object[] arr;

    public ArrayQueue(int maxSiz) {
        this.maxSiz = maxSiz + 1;
        arr = new Object[this.maxSiz];//总有一个空位置
    }

    public boolean isFull() {
        return (rear + 1) % maxSiz == front;
    }

    public boolean isEmpty() {
        return rear == front;
    }

    public void add(T obj) {
        if (isFull()) {
            throw new RuntimeException("The queue is full!");
        }
        arr[rear] = obj;
        rear = (rear + 1) % maxSiz;
    }

    public T get() {
        if (isEmpty()) {
            throw new RuntimeException("The queu is empty!");
        }
        Object obj = arr[front];
        front = (front + 1) % maxSiz;
        return (T) obj;
    }

    public void showAll() {
        if (isEmpty()) {
            return;
        }
        int tmp = front;//不能把指针弄乱了
        while (tmp != rear) {
            System.out.print(arr[tmp].toString() + " ");
            tmp = (tmp + 1) % maxSiz;
        }
    }

    public int size() {
        return (rear + maxSiz - front) % maxSiz;
    }

    public static void main(String[] args) {
        ArrayQueue<String> queue = new ArrayQueue<>(5);
        queue.add("a");
        queue.add("b");
        queue.add("c");
        queue.add("d");
        queue.add("e");
        queue.showAll();

        System.out.println(queue.size());
        System.out.println(queue.get());
        System.out.println(queue.get());
        System.out.println(queue.get());
        System.out.println(queue.get());
        System.out.println(queue.get());
        queue.add("f");
        queue.add("y");
        queue.showAll();
        System.out.println(queue.get());
        System.out.println(queue.get());

    }
}
