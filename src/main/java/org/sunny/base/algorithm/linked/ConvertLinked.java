package org.sunny.base.algorithm.linked;

/**
 * @ClassName ConvertSubLinked
 * @Description: TODO
 * @Author sunzhen
 * @Date 2020/7/7
 * @Version V1.0
 **/
public class ConvertLinked {
    public static void main(String args[]) {
        Node n8 = new Node(8, null);
        Node n7 = new Node(7, n8);
        Node n6 = new Node(6, n7);
        Node n5 = new Node(5, n6);
        Node n4 = new Node(4, n5);
        Node n3 = new Node(3, n4);
        Node n2 = new Node(2, n3);
        Node n1 = new Node(1, n2);
        // covertSub(n1);
        Node nn1 = new Node(1, null);
        //deleteNodeByEnd(nn1, 1);
        // covert(n1);
        covertPrint(n1);
    }

    //从中间开始反转前半部分的链表，快慢指针
    private static void covertSub(Node node) {
        Node head = node;
        Node fp = node;
        Node cur = node;

        Node pre = null;
        Node next = cur.getNext();

        while (fp.getNext() != null && fp.getNext().getNext() != null) {
            fp = fp.getNext().getNext();

            pre = cur;
            cur = next;
            next = cur.getNext();
            cur.setNext(pre);
        }
        head.setNext(next);

        while (cur != null) {
            System.out.print(cur.getData() + "  ");
            cur = cur.getNext();
        }
    }

    //从尾部计算，删除第n个节点；提前跑的指针
    private static void deleteNodeByEnd(Node node, int n) {
        Node head = node;
        Node n1 = node;
        Node n2 = node;
        for (int j = 0; j < n; j++) {
            n2 = n2.getNext();
        }
        while (n2 != null && n2.getNext() != null) {
            n1 = n1.getNext();
            n2 = n2.getNext();
        }
        if (n1.getNext() == null || n1.getNext().getNext() == null) {
            n1.setNext(null);
        } else {
            n1.setNext(n1.getNext().getNext());
        }

        while (head != null) {
            System.out.print(head.getData() + "  ");
            head = head.getNext();
        }
    }

    //全反转
    private static void covert(Node node) {
        Node head = node;

        Node cur = node;
        Node pre = null;
        Node next = cur.getNext();

        while (next != null) {
            pre = cur;
            cur = next;
            next = cur.getNext();
            cur.setNext(pre);
        }
        head.setNext(null);

        while (cur != null) {
            System.out.print(cur.getData() + "  ");
            cur = cur.getNext();
        }
    }

    //逆序打印
    private static void covertPrint(Node node) {
        if (node.getNext() == null) {
            System.out.println(node.getData());
        }else{
            covertPrint(node.getNext());
            System.out.println(node.getData());
        }

    }


}
