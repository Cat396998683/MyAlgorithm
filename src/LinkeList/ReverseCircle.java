package LinkeList;

public class ReverseCircle {
    public static void main(String[] args) {
        Node e = new Node("e", null);
        Node d = new Node("d", e);
        Node c = new Node("c", d);
        Node b = new Node("b", c);
        Node a = new Node("a", b);
        e.next = a;
      //  travel(a);
        Node node = reverseCircle(a);
        travel(node);


    }
    public static Node reverseCircle(Node head){
        Node temp = head;
        Node travel = null;
        Node pre = null;
        if(head.next == head){
            return head;
        }
        travel = head.next;
        // 遍历到环的最后一个元素
        while (travel.next != head){
            temp = travel.next;
            travel.next = pre;

            pre = travel;
            travel = temp;

        }
        // 此时travel为 head
        return travel;
    }
    public static void travel(Node head) {
        Node travel = head;
        while (travel.next != head){
            System.out.println(travel.value);
            travel = travel.next;

        }
        // 打印最后一个元素
        System.out.println(travel.value);
    }
}
