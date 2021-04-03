package tree.bst;

public class left_to_right_print {

    static void leftorder(Node node){
        if (node == null) {
            return;
        }
        leftorder(node.left);
        System.out.print(node.value + "  ");
    }
    static void rightorder(Node node){
        if (node == null) {
            return;
        }
        System.out.print(node.value + "  ");
        leftorder(node.right);
    }

    public static void main(String[] args) {
        BinarySearchTree bst = BinarySearchTree.createBinaryTree();
        System.out.println("left order of the given binary tree is as follows");
        leftorder(bst.root);
        System.out.println("\nright order of the given binary tree is as follows");
        rightorder(bst.root);
        System.out.println("\nleft + right order of tree is ");
        leftorder(bst.root);
        rightorder(bst.root.right);
    }
}
