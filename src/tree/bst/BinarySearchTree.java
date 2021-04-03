package tree.bst;

public class BinarySearchTree {
    Node root;

    Node add_value(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }
        if (value < current.value) {
            current.left = add_value(current.left, value);
        }
        if (value > current.value) {
            current.right = add_value(current.right, value);
        } else {
            return current;
        }
        return current;
    }

    static BinarySearchTree createBinaryTree() {
        BinarySearchTree bt = new BinarySearchTree();
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        return bt;
    }

    void add(int value) {
        root = add_value(root, value);
    }
}
