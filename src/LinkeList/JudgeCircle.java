package LinkeList;
/*
1,如果存在一个单链表, 我们只拥有单链表的头结点, 实现一个方法, 判断链表中是否有环
(即: 这个单链表的尾结点, 它下一个指向, 指向链表中的另外一个结点, 构成一个环)
 */
public class JudgeCircle {

    public static void main(String[] args) {

        Node e = new Node("e", null);
        Node d = new Node("d", e);
        Node c = new Node("c", d);
        Node b = new Node("b", null);
        Node a = new Node("a", null);

        // e.next = a;
        b.next = a;
        a.next = a;
        System.out.println(hasCircle(a));
    }

    private static boolean hasCircle(Node head) {
        boolean flag = false;
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null ){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                flag = true;
                break;
            }

        }
        return flag;
    }

}
