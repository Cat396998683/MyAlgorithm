package tree.binarytree;
/*
生成一棵二叉树
                 4
               /   \
              2     7
             /\   /  \
            1 3  6    9
 */
public class InitTree {
    public static TreeNode init(){
        TreeNode node1 = new TreeNode(1,null,null);
        TreeNode node2 = new TreeNode(3,null,null);
        TreeNode node3 = new TreeNode(6,null,null);
        TreeNode node4 = new TreeNode(9,null,null);
        TreeNode node5 = new TreeNode(2,node1,node2);
        TreeNode node6 = new TreeNode(7,node3,node4);
        TreeNode node7 = new TreeNode(4,node5,node6);

        TreeNode root = node7;

        return root;

    }
}
