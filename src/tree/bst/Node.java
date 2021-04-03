/**
 *      method to create an node or an root in an binary search tree
 */
package tree.bst;

public class Node {
    int value;
    Node left;
    Node right;

    Node(int value) {
        this.value = value;
        this.right = null;
        this.left = null;
    }
}
