package LinkeList;
/*
剑指 Offer II 022. 链表中环的入口节点

给定一个链表，返回链表开始入环的第一个节点。 从链表的头节点开始沿着 next 指针进入环的第一个节点为环的入口节点。如果链表无环，则返回 null。

为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。
如果 pos 是 -1，则在该链表中没有环。注意，pos 仅仅是用于标识环的情况，并不会作为参数传递到函数中。

说明：不允许修改给定的链表。
 */
public class Offer022 {

    public static void main(String[] args) {
        Node e = new Node("e", null );
        Node d = new Node("d", e);
        Node c = new Node("c", d);
        Node b = new Node("b", c);
        Node a = new Node("a", b);
        e.next = c;

        System.out.println(detectCycle(a).value);
    }

    public static Node detectCycle(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                Node node1 = head;
                Node node2 = fast;
                while (node1 != node2){
                    node1 = node1.next;
                    node2 = node2.next;
                }
                return node1;
            }
        }

        return null;
    }
}

