package LinkeList.recursion;

import LinkeList.Node;

public class Reverse2 {
    public static void main(String[] args) {
        Node e = new Node("e", null);
        Node d = new Node("d", e);
        Node c = new Node("c", d);
        Node b = new Node("b", c);
        Node a = new Node("a", b);
        e.next = a;

        reverse2Recursion(a,a);
        System.out.println();

    }
    /*
     private static Node reverseRecursion(Node travel) {
        if(travel == null || travel.next == null){
            return travel;
        }
        Node newHead = reverseRecursion(travel.next);
        travel.next.next = travel;
        travel.next = null;
        return  newHead;
    }
     */

    // 反转循环链表
    private static Node reverse2Recursion(Node travel,Node key) {
        // travel 等于 key
        if(travel.next == key){
            // 结束条件
            // 当travel.next = key时 表示循环链表从头绕到了尾
            return travel;
        }
        // 按照函数定义向下递归
        Node newHead = reverse2Recursion(travel.next,key);
        // 只关心一级的递归过程
        // newHead表示已经完成 反转的部分 需要将travel与travel.next交换,并且交换后的后一个节点指向newHead
        travel.next.next = travel;
        travel.next = newHead;
        return  newHead;
    }

    // 反转循环链表与反转链表区别在于
    // 1. 递归结束条件：单链表尾指向null,循环链表尾指向了初始的头
    // 2. 每一级的操作的区别：单链表 travel 与 new Head交换即可
    //                    循环链表 需要将travel与travel.next交换,并且交换后的后一个节点指向newHead
}
