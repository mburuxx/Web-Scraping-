public class TestRedBlackTree {

public static void main(String[] args) {
RedBlackTree tree = new RedBlackTree();
tree.insert(49);
tree.insert(85);
tree.insert(51);
tree.insert(90);
tree.insert(28);

tree.insert(37);
tree.insert(61);
tree.insert(10);
tree.insert(32);
tree.insert(40);
tree.insert(59);

tree.insert(19);
tree.insert(63);
tree.insert(26);
tree.insert(55);

tree.delete(49);
tree.delete(59);
tree.delete(51);
tree.delete(19);
tree.delete(26);
tree.delete(10);

System.out.println("Inorder Tree Walk:");
tree.inorderTreeWalk(tree.root);
}
}