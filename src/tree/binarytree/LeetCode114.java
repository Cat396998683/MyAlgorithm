package tree.binarytree;

/**
 * 114. 二叉树展开为链表
 * 给你二叉树的根结点 root ，请你将它展开为一个单链表：
 *
 * 展开后的单链表应该同样使用 TreeNode ，其中 right 子指针指向链表中下一个结点，而左子指针始终为 null 。
 * 展开后的单链表应该与二叉树 先序遍历 顺序相同。
 */

public class LeetCode114 {
    public static void main(String[] args) {

    }
    public void flatten(TreeNode root) {


          // 进入节点时执行 先序


          flatten(root.left);
          flatten(root.right);
    }

}