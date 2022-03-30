package LinkeList;
/*
反转链表
 */
public class ReverseLinkList {

    public static void main(String[] args) {
        Node e = new Node("e", null);
        Node d = new Node("d", e);
        Node c = new Node("c", d);
        Node b = new Node("b", c);
        Node a = new Node("a", b);
        e.next = a;
        travel(a);
        Node node = ReverseLinked(a);
        travel(a);


    }

    public static void travel(Node head) {
        while (head != null){
            System.out.println(head);
            head = head.next;

        }
    }

    public static Node ReverseLinked(Node head){
        // 存储当前指向节点的next节点
        Node temp;
        // 用于遍历链表
        Node travel = head;
        // 用于反转链表节点指向 让 travel.next 指向 travel
        Node pre = null;
        while (travel != null){
            // 存在travel的后续节点
            temp = travel.next;
            // 反转travel指向
            travel.next = pre;

            // 向后遍历;
            pre = travel;
            travel = temp;
        }
        return pre;
    }

}





