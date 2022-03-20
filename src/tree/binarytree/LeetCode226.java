package tree.binarytree;

/**
 * 给你一棵二叉树的根节点 root ，翻转这棵二叉树，并返回其根节点。
 * <p>
 * 写树相关的算法，简单说就是，先搞清楚当前 root 节点「该做什么」以及「什么时候做」，
 * 然后根据函数定义递归调用子节点，递归调用会让孩子节点做相同的事情。
 * <p>
 * 分析：反转二叉树，就是讲每一个节点的左右子树互换
 * 应该在进入每个节点时指向，==> 先序
 * 离开节点时也可以 ==> 后序
 */
public class LeetCode226 {
    public static void main(String[] args) {
        TreeNode root = InitTree.init();
        TreeNode treeNode = invertTree(root);
        Traverse.firstTraverse(treeNode);

    }

    public static TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        // 交换左右子树
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        // 递归执行下去
        // 左右子树谁先执行是无所谓的，所以不用关系是否已经互换
        invertTree(root.left);
        invertTree(root.right);
        return root;


    }
}
