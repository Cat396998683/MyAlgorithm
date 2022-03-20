package tree.binarytree;

/**
 * 116. 填充每个节点的下一个右侧节点指针
 * 给定一个 完美二叉树 ，其所有叶子节点都在同一层，每个父节点都有两个子节点。二叉树定义如下：
 * <p>
 * struct Node {
 * int val;
 * Node *left;
 * Node *right;
 * Node *next;
 * }
 * 填充它的每个 next 指针，让这个指针指向其下一个右侧节点。如果找不到下一个右侧节点，则将 next 指针设置为 NULL。
 * <p>
 * 初始状态下，所有 next 指针都被设置为 NULL。
 * <p>
 * 分析：
 * 节点连接分为两种情况：
 * 1：同一节点的左孩子指向其右孩子（先序遍历即可）
 * 2：不同子树之间相邻节点的连接(单纯的先中后序遍历无法做到)
 * <p>
 * 之前所说：二叉树题目的一个难点就是，如何把题目的要求细化成每个节点需要做的事情。
 * 如果仅仅一个节点的话，肯定是没办法做到情况2的
 * <p>
 * 思路：一个节点做不到，我们就给他安排两个节点，
 * 「将每一层二叉树节点连接起来」可以细化成「将每两个相邻节点都连接起来」
 * <p>
 * 所有相邻节点表示：
 * node1.left,node1.right
 * node2.left,node2.right
 * node1.right,node2.left
 */
public class LeetCode116 {
    public static void main(String[] args) {
        Node root;
      

    }
    // 解法一：
    Node connect(Node root){
        if(root == null){
            return null;
        }
        connectTwoNode(root.left,root.right);
        return root;
    }
    void connectTwoNode(Node node1,Node node2){
        if(node1 == null || node2 == null){
            return;
        }
        node1.next = node2;

        // 理解递归
        // 写递归算法的关键是要明确函数的「定义」是什么，
        // 然后相信这个定义，利用这个定义推导最终结果，绝不要跳入递归的细节。
        //写树相关的算法，简单说就是，先搞清楚当前 root 节点「该做什么」以及「什么时候做」，
        // 然后根据函数定义递归调用子节点，递归调用会让孩子节点做相同的事情。
        connectTwoNode(node1.left,node1.right);
        connectTwoNode(node2.left,node2.right);
        connectTwoNode(node1.right,node2.left);

    }

    // 解法二：
    public Node connect2(Node root) {
        if (root == null) {
            return null;
        }
        if (root.left != null) {
            root.left.next = root.right;
            if (root.next != null) {
                root.right.next = root.next.left;
            }
        }
        connect2(root.left);
        connect2(root.right);
        return root;
    }
}

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}