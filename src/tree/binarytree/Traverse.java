package tree.binarytree;

/**
 * 二叉树的前，中，后序遍历框架
 */

public class Traverse {
    public static void main(String[] args) {
        TreeNode root = InitTree.init();
        // 先序 4213769
        firstTraverse(root);


    }

    /**
     * 二叉树遍历框架
     * 思想：
     * 前中后序是遍历二叉树过程中处理每一个节点的三个特殊时间点，绝不仅仅是三个顺序不同的 List：
     *
     * 前序位置的代码在刚刚进入一个二叉树节点的时候执行；
     *
     * 后序位置的代码在将要离开一个二叉树节点的时候执行；
     *
     * 中序位置的代码在一个二叉树节点左子树都遍历完，即将开始遍历右子树的时候执行。
     * @param root
     */
    public static void firstTraverse(TreeNode root){
        if(root != null) {
            //前序遍历位
            System.out.println(root.val);
            firstTraverse(root.left);
            // 中序遍历位
            firstTraverse(root.right);
            // 后序遍历位
        }
    }

}
