package tree.bst;

public class A_Orders {

    static void inorder(Node node) {
        if (node == null) {
            return;
        }
        inorder(node.left);
        System.out.print(node.value + "  ");
        inorder(node.right);
    }

    static void preorder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + "  ");
        inorder(node.left);
        inorder(node.right);
    }

    static void postorder(Node node) {
        if (node == null) {
            return;
        }
        inorder(node.left);
        inorder(node.right);
        System.out.print(node.value + "  ");
    }

    public static void main(String[] args) {
        BinarySearchTree bst = BinarySearchTree.createBinaryTree();
        System.out.println("preorder for the following binary tree is as follows :");
        inorder(bst.root);
        System.out.println("\npreorder for the following binary tree is as follows :");
        preorder(bst.root);
        System.out.println("\npostorder for the following binary tree is as follows :");
        postorder(bst.root);
    }
}
