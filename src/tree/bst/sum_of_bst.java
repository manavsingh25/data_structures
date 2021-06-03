/**
 *
 *                  finding the sum of nodes of an binary tree
 *
 */
package tree.bst;

public class sum_of_bst {
    public static void main(String[] args) {
        binarySearhTree bst = binarySearhTree.createBinaryTree();
        int sum = sumOfBST(bst.root);
        System.out.println(sum);
    }
    static int sumOfBST(Node node) {
        if (node == null) {
            return 0;
        }
        /**
         *
         *
         *
         * both the codes are correct..................
         * finding the sum of the nodes a binary tree..
         *
         *
         *
         */
//        if (node.left == null&&node.right==null) {
//            return node.value;
//        }
//        if (node.left==null) {
//            return sumOfBST(node.right)+node.value;
//        }
//        if (node.right==null) {
//            return sumOfBST(node.left)+node.value;
//        }
//        return node.value+sumOfBST(node.left)+sumOfBST(node.right);

        return node.value +sumOfBST(node.left)+sumOfBST(node.right);
    }
}
