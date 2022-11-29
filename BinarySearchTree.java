public class BinarySearchTree {
 
    public static void main(String[] args) {
        int[] numbers = {76, 60, 81, 82, 28, 34, 73, 39, 85, 26, 42, 95, 66, 15, 06, 45, 18, 98, 33, 19, 31, 93, 86, 13, 61, 41, 97, 46, 40, 37};
 
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(numbers);
 
        System.out.println("Inorder traversal of the balanced BST:");
        tree.inorder();
 
        System.out.println("\nPreorder traversal of the balanced BST:");
        tree.preorder();
 
        System.out.println("\nPostorder traversal of the balanced BST:");
        tree.postorder();
    }
 
    private Node root;
 
    public void insert(int[] numbers) {
        root = insert(numbers, 0, numbers.length - 1);
    }
 
    private Node insert(int[] numbers, int low, int high) {
        if (low > high) {
            return null;
        }
 
        int mid = (low + high) / 2;
        Node newNode = new Node(numbers[mid]);
        newNode.left = insert(numbers, low, mid - 1);
        newNode.right = insert(numbers, mid + 1, high);
        return newNode;
    }
 
    public void inorder() {
        inorder(root);
    }
 
    private void inorder(Node node) {
        if (node == null) {
            return;
        }
 
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }
 
    public void preorder() {
        preorder(root);
    }
 
    private void preorder(Node node) {
        if (node == null) {
            return;
        }
 
        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }
 
    public void postorder() {
        postorder(root);
    }
 
    private void postorder(Node node) {
        if (node == null) {
            return;
        }
 
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }
 
    private static class Node {
        int data;
        Node left;
        Node right;
 
        public Node(int data) {
            this.data = data;
        }
    }
}