package org.sunny.base.algorithm.tree;

import java.util.Stack;

/**
 * @ClassName MainTest
 * @Description: TODO
 * @Author sunzhen
 * @Date 2020/7/9
 * @Version V1.0
 **/
public class MainTest {
    public static void main(String args[]) {
        Node<String> n1 = new Node<>("A");
        Node<String> n2 = new Node<>("B");
        Node<String> n3 = new Node<>("C");
        Node<String> n4 = new Node<>("D");
        Node<String> n5 = new Node<>("E");
        Node<String> n6 = new Node<>("F");
        Node<String> n7 = new Node<>("G");

        n1.setLeftChild(n2);
        n1.setRightChild(n3);
        n2.setLeftChild(n4);
        n2.setRightChild(n5);
        n3.setLeftChild(n6);
        n3.setRightChild(n7);

        behindTraverseStack(n1);
    }

    //D   B   E   A   F   C   G
    public static void midTraverse(Node node) {
        if (node == null)
            return;
        midTraverse(node.getLeftChild());
        System.out.print(node.getData() + "   ");
        midTraverse(node.getRightChild());
    }

    //D   B   E   A   F   C   G
    public static void midTraverseStack(Node node) {
        if (node == null)
            return;
        Stack<Node> stack = new Stack<>();
        Node curr = node;
        while (!stack.isEmpty() || curr != null) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.getLeftChild();
            }
            curr = stack.pop();
            System.out.print(curr.getData() + "   ");
            curr = curr.getRightChild();
        }
       /* while (!stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.getLeftChild();
            }
            curr = stack.pop();
            System.out.print(curr.getData() + "   ");

        }*/


      /*  while (!stack.isEmpty() && head != null){

            while (head.hasLeft()) {
                head = head.getLeftChild();
                stack.push(head);
            }//一直找到左最子节点

            System.out.print(head.getData() + "   ");//打印左子节点

            while (!head.hasRight() && !stack.isEmpty()) {
                head = stack.pop();
            }

            System.out.print(head.getData() + "   ");

            head = head.getRightChild();
            stack.push(head);
        }*/

    }

    //A   B   D   E   C   F   G
    public static void preTraverse(Node node) {
        if (node == null)
            return;
        System.out.print(node.getData() + "   ");
        preTraverse(node.getLeftChild());
        preTraverse(node.getRightChild());
    }

    //A   B   D   E   C   F   G
    public static void preTraverseStack(Node node) {
        if (node == null)
            return;
        Stack<Node> stack = new Stack<>();
        Node curr = node;
        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                System.out.print(curr.getData() + "   ");
                stack.push(curr);
                curr = curr.getLeftChild();
            }
            curr = stack.pop();
            curr = curr.getRightChild();
        }
    }

    //D   E   B   F   G   C   A
    public static void behindTraverse(Node node) {
        if (node == null)
            return;
        behindTraverse(node.getLeftChild());
        behindTraverse(node.getRightChild());
        System.out.print(node.getData() + "   ");
    }

    //D   E   B   F   G   C   A
    public static void behindTraverseStack(Node node) {
        if (node == null)
            return;
        Stack<Node> stack = new Stack<>();
        Node curr = node;
        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.getLeftChild();
            }
            curr = stack.pop();
            System.out.print(curr.getData() + "   ");
            curr = curr.getRightChild();

        }
    }
}
