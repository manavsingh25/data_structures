package queue;
import java.util.*;
//this code is for printing the zigzagtraversal of an binary tree
//which means that after printing the root node then it will start
//printing rows ,the first row is the root node itself ,after that
//for the second row it will start printing the elements from right side
//for third row the elements will be printed from the left and soo on...
public class zigZagTreeTraversal {
    static class Node {
        int data;
        Node leftChild;
        Node rightChild;

        Node(int data) {
            this.data = data;
        }
    }
    static class BTree {
        Node rootNode;
        void printZigZagTraversal() {
            if (rootNode == null)
                return;
            //here we are creating two different stacks..
            Stack<Node> currentLevel = new Stack<>();
            Stack<Node> nextLevel = new Stack<>();
            //psuhing the value in an empty created stack
            currentLevel.push(rootNode);
            //taking a flag-boolean variable and setting it to true..
            boolean leftToRight = true;
            while (!currentLevel.isEmpty()) {
                //popping the current level element and storing it in a new variable..
                Node node = currentLevel.pop();
                //printing the popped out data immediately..
                System.out.print(node.data + " ");
                //if the set flag-boolean variable is true then these lines of code will execute..
                if (leftToRight) {
                    if (node.leftChild != null) {
                        nextLevel.push(node.leftChild);
                    }
                    if (node.rightChild != null) {
                        nextLevel.push(node.rightChild);
                    }
                }
                else {
                    if (node.rightChild != null) {
                        nextLevel.push(node.rightChild);
                    }
                    if (node.leftChild != null) {
                        nextLevel.push(node.leftChild);
                    }
                }
                if (currentLevel.isEmpty()) {
                    leftToRight = !leftToRight;
                    Stack<Node> temp = currentLevel;
                    currentLevel = nextLevel;
                    nextLevel = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        BTree tree = new BTree();
        tree.rootNode = new Node(1);
        tree.rootNode.leftChild = new Node(2);
        tree.rootNode.rightChild = new Node(3);
        tree.rootNode.leftChild.leftChild = new Node(7);
        tree.rootNode.leftChild.rightChild = new Node(6);
        tree.rootNode.rightChild.leftChild = new Node(5);
        tree.rootNode.rightChild.rightChild = new Node(4);

        System.out.println("ZigZag Order traversal of binary tree is:");
        tree.printZigZagTraversal();
    }
}


