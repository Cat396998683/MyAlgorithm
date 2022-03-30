package LinkeList.recursion;

import LinkeList.Node;

import java.awt.*;

/*
给你一个链表的头节点 head 和一个整数 val ，
请你删除链表中所有满足 Node.val == val 的节点，并返回 新的头节点 。

示例 1：

输入：head = [1,2,6,3,4,5,6], val = 6
输出：[1,2,3,4,5]

 */
public class RemoveEle {
    public static void main(String[] args) {
        Node e = new Node("a", null);
        Node d = new Node("d", e);
        Node c = new Node("c", d);
        Node b = new Node("b", c);
        Node a = new Node("a", b);

    }

    public static Node removeElements(Node head,String val){
        // 递归结束条件 应该用链表的状态判断，而不是节点状态
        // 如果链表为空 就该结束  head == null √
        // 而不应该用head.next == null 此状态表示链表还有一个元素 ×
        if(head == null){
            return head;
        }
        // 表示以newNode为首的链表中不含val值
        Node newNode = removeElements(head.next,val);
        // 判断当前节点是否为val
        if(val.equals(head.value)){
            // 相等就删除
            return newNode;
        }
        // 说明不等
        head.next = newNode;
        return head;

    }

}
