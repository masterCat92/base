package org.sunny.base.algorithm.tree;

/**
 * @ClassName Node
 * @Description: 二叉树节点
 * @Author sunzhen
 * @Date 2020/4/15
 * @Version V1.0
 **/
public class Node<T> {

    private T data;//节点数据
    private Node<T> leftChild;//左子节点
    private Node<T> rightChild;//右子节点

    public Node(T data) {
        this.data = data;
    }

    public Node() {
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node<T> leftChild) {
        this.leftChild = leftChild;
    }

    public Node<T> getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node<T> rightChild) {
        this.rightChild = rightChild;
    }

    public boolean hasLeft() {
        return leftChild != null;
    }

    public boolean hasRight() {
        return rightChild != null;
    }
}
