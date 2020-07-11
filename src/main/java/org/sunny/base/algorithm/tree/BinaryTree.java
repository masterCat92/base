package org.sunny.base.algorithm.tree;

/**
 * @ClassName BinaryTree
 * @Description: TODO
 * @Author sunzhen
 * @Date 2020/4/15
 * @Version V1.0
 **/
public class BinaryTree<T> {
    public Node<T> root;//根

    //清除树
    public void clear() {
        clear(root);
    }

    //清除某一节点
    public void clear(Node<T> node) {
        if (null != node) {
            clear(node.getLeftChild());
            clear(node.getRightChild());
            node = null;
        }
    }

    //树是否为空
    public boolean isEmpty() {
        return null == root;
    }

    //---------------------遍历---------

    /**
     * 前序遍历(递归)
     * 访问根节点->根遍历左子树->根遍历右子树->退出
     * 根左右，深度遍历
     */
    public void preOrder(Node<T> node) {
        if (null != node) {
            System.out.print(node.getData() + "");
            preOrder(node.getLeftChild());
            preOrder(node.getRightChild());
        }
    }




}
