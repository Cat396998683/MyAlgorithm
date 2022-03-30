package LinkeList;

/**
 * 两两反转链表
 * 创建日期: 2022/03/30 10:50
 *
 * @author TianZheng
 */
public class Demo {
    public static void main(String[] args) {

        Node a = new Node("a", null);
        Node b = new Node("b", null);
        Node c = new Node("c", null);
        Node d = new Node("d", null);
        Node e = new Node("e", null);
        Node f = new Node("f", null);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        Node result = reverse(a);
        while (result != null) {
            System.out.println(result.value);
            result = result.next;
        }
    }

    private static Node reverse(Node head) {

        // 如果链表为空或者只有一个元素
        if (head == null || head.next == null) {
            return head;
        }

        // 奇数
        Node midOfOdd = head;
        // 偶数
        Node midOfEven = head.next;

        Node headOfEven = head.next;


        // 把偶数位和奇数位分成两个单链表
        // 奇数位头结点head，偶数位头结点headOfEven
        while (midOfEven.next != null) {
            midOfOdd.next = midOfOdd.next.next;
            midOfEven.next = midOfEven.next.next;
            midOfOdd = midOfOdd.next;
            midOfEven = midOfEven.next;
            if (midOfEven == null) {
                break;
            }
        }
        midOfOdd.next = null;

        // 逐个把偶数位元素插入到奇数位单链表中
        Node currentInsert = head;
        Node nextInsert = currentInsert.next;
        Node resultHead = headOfEven;

        while (headOfEven != null) {
            currentInsert.next = headOfEven.next;
            headOfEven.next = currentInsert;
            currentInsert = nextInsert;
            if (nextInsert == null) {
                break;
            }
            nextInsert = nextInsert.next;
            if (headOfEven.next.next == null) {
                headOfEven.next.next = currentInsert;
                break;
            }
            headOfEven = headOfEven.next.next;
        }

        return resultHead;
    }
}



