package LinkeList.recursion;

import LinkeList.Node;

/*
递归遍历链表
 */
public class Travel {
    public static void main(String[] args) {
        Node e = new Node("e", null);
        Node d = new Node("d", e);
        Node c = new Node("c", d);
        Node b = new Node("b", c);
        Node a = new Node("a", b);
        travelRecursion(a);
    }

    public static void travelRecursion(Node head){
        // for while 都是正序
        // 递归作为栈 天生逆序(可以利用这一特点) 实际上是可逆可正
        // 代码写在内部调用前为正 在内部调用后就为逆
        Node travel = head;
        if(travel == null || travel.next == null){
            return;
        }
         System.out.println(travel.value); //正序输出位
        travelRecursion(travel.next);
        // System.out.println(travel.value); 逆序输出位

    }


}
