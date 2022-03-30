package LinkeList;
/*
24. 两两交换链表中的节点

给你一个链表，两两交换其中相邻的节点，并返回交换后链表的头节点。你必须在不修改节点内部的值的情况下完成本题（即，只能进行节点交换）。
如 1->2->3->4
变为 2->1->4->3

思路:
使用head,tail指针。

初始 head 指向头结点
tail = head
计数 在范围内反转

遍历递归下去tail.next 指向下一轮的head

 */
public class SwapPairsNode {
    public static void main(String[] args) {



    }
    public static Node swapPairs(Node head) {
        // 先写出区域反转
        Node tail = head;
        Node pre = null;
        Node tavel = head;
        Node temp = head.next;


        temp = head.next;
        head.next = pre;



        return null;
    }
}
