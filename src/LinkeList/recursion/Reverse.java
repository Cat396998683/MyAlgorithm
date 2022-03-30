package LinkeList.recursion;

import LinkeList.Node;

public class Reverse {
    public static void main(String[] args) {
        Node e = new Node("e", null);
        Node d = new Node("d", e);
        Node c = new Node("c", d);
        Node b = new Node("b", c);
        Node a = new Node("a", b);
        reverseRecursion(a);

        System.out.println();
    }

    private static Node reverseRecursion(Node travel) {
        if(travel == null || travel.next == null){
            return travel;
        }
        Node newHead = reverseRecursion(travel.next);
        travel.next.next = travel;
        travel.next = null;
        return  newHead;
    }
}
