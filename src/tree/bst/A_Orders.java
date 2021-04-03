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
        System.out.println(node.value + "  ");
        inorder(node.left);
        inorder(node.right);
    }

    static void postorder(Node node) {
        if (node == null) {
            return;
        }
        inorder(node.left);
        inorder(node.right);
        System.out.println(node.value + "  ");
    }

    public static void main(String[] args) {
        BinarySearchTree bst = BinarySearchTree.createBinaryTree();
        inorder(bst.root);
    }
}
