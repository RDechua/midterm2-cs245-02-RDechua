class BinarySearchTree {

    /** An inner class representing a node in a binary search tree */
    private class BSTNode {
        int data; // value stored at the node
        BSTNode left; // left subtree
        BSTNode right; // right subtree

        BSTNode(int newdata) {
            data = newdata;
        }
    }

    private BSTNode root; // the root of the tree, an instance variable of class BinarySearchTree

    public BinarySearchTree() {
        root = null; // initially, the tree is empty
    }

    /**
     * Insert a given element into the BST tree
     * @param elem element to insert into the BST tree
     */
    public void insert(int elem) {
        root = insert(root, elem);
    }

    /**
     *
     * Counts how many nodes have two children.
     * See the private method with the same name.
     * @return number of nodes with two children.
     */
    public int numOfNodesWithTwoChildren() {
        return numOfNodesWithTwoChildren(root);
    }

    /**
     * Checks if the element is in the tree
     * @param elem element to search for
     * @return true if elem is in the tree, and false otherwise
     */
    public boolean find(int elem) {
        return find(root, elem);
    }

    /**
     * Insert elem into the tree with the given root
     * @param tree root of a tree
     * @param elem element to insert
     * @return the root of a tree that contains the new node
     */
    private BSTNode insert(BSTNode tree, int elem) {
        if (tree == null) {
            return new BSTNode(elem);
        }
        if (elem < tree.data) {
            tree.left = insert(tree.left, elem);
            return tree;
        } else {
            tree.right = insert(tree.right, elem);
            return tree;
        }
    }

    /**
     * Count how many nodes have two children.
     * @param node root of the given tree
     * @return number of nodes that have two children - see example on Canvas.
     */
    private int numOfNodesWithTwoChildren(BSTNode node) {
        // FILL IN CODE:

        return 0; // change
    }

    /**
     * The function was supposed to find a given element in the tree, but has bugs
     * @param node root of the tree
     * @param elem element to search for
     * @return true if the elem is in the tree, false otherwise
     */
    private boolean find(BSTNode node, int elem) {
        // Find bug(s) in this incorrect and inefficient method
        // that was supposed to check if elem is in the tree
        // TODO: Fix bugs to make it work and make it efficient
        BSTNode curr = root;
        if (curr == null)
            return false;
        if (curr.data == elem)
            return true ;
        find(node.left, elem);
        find(node.right, elem);

        return false;
    }


    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(10);
        tree.insert(8);
        tree.insert(6);
        tree.insert(4);
        tree.insert(1);
        tree.insert(7);
        tree.insert(0);
        tree.insert(2);
        tree.insert(3);
        tree.insert(20);
        tree.insert(25);
        tree.insert(22);
        System.out.print("Number of nodes with two children: ");
        System.out.println(tree.numOfNodesWithTwoChildren()); // 3
        // Test more on your own
       /*
                 10
              8    20
            6       25
          4  7    22
        1
      0  2
          3
        */

        // Uncomment to test the find method after fixing bugs:
       /**
        System.out.println(tree.find(22)); // true
        System.out.println(tree.find(0)); // true
        System.out.println(tree.find(4)); // true
        System.out.println(tree.find(5)); // false
        */
    }
}
