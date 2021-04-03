/**
 *
 *      to find the sum of leaf nodes of an binary tree
 *
 */
package tree.bst;

public class sum_of_leafNodes_in_bst {
    public static void main(String[] args) {
        binarySearhTree bst = binarySearhTree.createBinaryTree();
//        int sum = postorder(bst.root);
//        System.out.println(sum);
        int sum=0;
        sum= sum_leaf_nodes(bst.root);
        System.out.println(sum);
    }
    static int sum_leaf_nodes(Node node) {
        if (node == null) {
            return 0;
        }
        if(node.left==null&&node.right==null)
        {
            return node.value;
        }
//        sum_leaf_nodes(node.left);
//        sum_leaf_nodes(node.right);

        return sum_leaf_nodes(node.left)+sum_leaf_nodes(node.right);
    }

}
