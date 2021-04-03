/**
 *          to find the height of an binary tree
 */
package tree.bst;

public class height_of_tree {
    static int heightOfBT(Node node) {
        if(node==null){
            return 0;
        }
        if (node.left == null&&node.right==null) {
            return 1;
        }
        if (node.left==null) {
            return heightOfBT(node.right)+1;
        }
        if (node.right==null) {
            return heightOfBT(node.left);
        }
        return Integer.max(heightOfBT(node.left), heightOfBT(node.right)) +1;
    }

    public static void main(String[] args) {
        binarySearhTree bst = binarySearhTree.createBinaryTree();
        int height = heightOfBT(bst.root);
        System.out.println(height);
    }
}
