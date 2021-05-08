package tree.bst;

public class binaryTree {
    public static void main(String[] args) {
        System.out.println("binary tree complete");
        /**
         *
         public class BinaryTree {

         Node root;

         class Node {
         int value;
         Node left;
         Node right;

         Node(int value) {
         this.value = value;
         right = null;
         left = null;
         }
         }


         private Node addRecursive(Node current, int value) {
         if (current == null) {
         return new Node(value);
         }

         if (value < current.value) {
         current.left = addRecursive(current.left, value);
         } else if (value > current.value) {
         current.right = addRecursive(current.right, value);
         } else {
         // value already exists
         return current;
         }

         return current;
         }


         public void add(int value) {
         root = addRecursive(root, value);
         }


         static  private BinaryTree createBinaryTree() {
         BinaryTree bt = new BinaryTree();

         bt.add(6);
         bt.add(4);
         bt.add(8);
         bt.add(3);
         bt.add(5);
         bt.add(7);
         bt.add(9);

         return bt;
         }


         private Node deleteRecursive(Node current, int value) {
         if (current == null) {
         return null;
         }

         if (value == current.value) {
         // Node to delete found
         // ... code to delete the node will go here
         if (current.left == null && current.right == null) {
         return null;
         }
         if (current.right == null) {
         return current.left;
         }
         if (current.left == null) {
         return current.right;
         } else {
         int smallestValue = findSmallestValue(current.right);
         current.value = smallestValue;
         current.right = deleteRecursive(current.right, smallestValue);
         return current;
         }

         }

         if(value<current.value)
         {
         current.left = deleteRecursive(current.left, value);
         return current;
         }

         current.right = deleteRecursive(current.right, value);
         return current;
         }


         public void delete(int value) {
         root = deleteRecursive(root, value);
         }

         private int findSmallestValue(Node root) {
         return root.left == null
         ? root.value
         : findSmallestValue(root.right);
         }



         /** orders of a binary tree */



  /**      public void traverseInOrder(Node node) {
            if (node != null) {
                traverseInOrder(node.left);
                System.out.print(" " + node.value);
                traverseInOrder(node.right);
            }
        }


        public void traversePreOrder(Node node) {
            if (node != null) {
                System.out.print(" " + node.value);
                traversePreOrder(node.left);
                traversePreOrder(node.right);
            }
        }



        public void traversePostOrder(Node node) {
            if (node != null) {
                traversePostOrder(node.left);
                traversePostOrder(node.right);
                System.out.print(" " + node.value);
            }
        }

        public static void main(String[] args) {
            BinaryTree root = createBinaryTree();
            System.out.println("hakuma matata");

        }


 *
 *          breadth first search
 *
 *
 *
 public void traverseLevelOrder() {
 if (root == null) {
 return;
 }

 Queue<Node> nodes = new LinkedList<>();
 nodes.add(root);

 while (!nodes.isEmpty()) {

 Node node = nodes.remove();

 System.out.print(" " + node.value);

 if (node.left != null) {
 nodes.add(node.left);
 }

 if (node.right != null) {
 nodes.add(node.right);
 }
 }
 }

 */
    }
}
