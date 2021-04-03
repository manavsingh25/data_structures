/**
 *      creating an binary search tree by allocating the values to the nodes
 */
package tree.bst;

public class binarySearhTree {
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

//        static BinarySearhTree createBinaryTree() {
//            BinarySearhTree = new BinarySearhTree();
//              bt.add(6);
//              bt.add(4);
//              bt.add(8);
//              bt.add(3);
//              bt.add(5);
//              bt.add(7);
//              bt.add(9);
//              return bt;
//        }
//    public void add(int value) {
//        root = add_value(root, value);
//    }
    static binarySearhTree createBinaryTree() {
        binarySearhTree bt = new binarySearhTree();
        bt.add(8);
        bt.add(6);
        bt.add(9);
        bt.add(4);
        bt.add(10);
        bt.add(3);
        bt.add(5);
        bt.add(18);
        bt.add(15);
        bt.add(16);
        return bt;
    }
    public void add(int value) {
        root = add_value(root, value);
    }

}


