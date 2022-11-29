

public class RedBlackTree {

    Node root;
    private Node nil;

    private class Node {
        int key;
        Node parent;
        Node left;
        Node right;
        boolean color;

        Node(int key, Node parent, Node left, Node right, boolean color) {
            this.key = key;
            this.parent = parent;
            this.left = left;
            this.right = right;
            this.color = color;
        }
    }

    public RedBlackTree() {
        nil = new Node(0, null, null, null, false);
        root = nil;
    }

    public void leftRotate(Node x) {
        Node y = x.right;
        x.right = y.left;
        if (y.left != nil) {
            y.left.parent = x;
        }
        y.parent = x.parent;
        if (x.parent == nil) {
            root = y;
        } else if (x == x.parent.left) {
            x.parent.left = y;
        } else {
            x.parent.right = y;
        }
        y.left = x;
        x.parent = y;
    }

    public void rightRotate(Node x) {
        Node y = x.left;
        x.left = y.right;
        if (y.right != nil) {
            y.right.parent = x;
        }
        y.parent = x.parent;
        if (x.parent == nil) {
            root = y;
        } else if (x == x.parent.right) {
            x.parent.right = y;
        } else {
            x.parent.left = y;
        }
        y.right = x;
        x.parent = y;
    }

    public void insert(int key) {
        Node z = new Node(key, nil, nil, nil, true);
        Node y = nil;
        Node x = root;
        while (x != nil) {
            y = x;
            if (z.key < x.key) {
                x = x.left;
            } else {
                x = x.right;
            }
        }
        z.parent = y;
        if (y == nil) {
            root = z;
        } else if (z.key < y.key) {
            y.left = z;
        } else {
            y.right = z;
        }
        z.left = nil;
        z.right = nil;
        z.color = true;
        insertFixup(z);
    }

    public void insertFixup(Node z) {
        while (z.parent.color) {
            if (z.parent == z.parent.parent.left) {
                Node y = z.parent.parent.right;
                if (y.color) {
                    z.parent.color = false;
                    y.color = false;
                    z.parent.parent.color = true;
                    z = z.parent.parent;
                } else {
                    if (z == z.parent.right) {
                        z = z.parent;
                        leftRotate(z);
                    }
                    z.parent.color = false;
                    z.parent.parent.color = true;
                    rightRotate(z.parent.parent);
                }
            } else {
                Node y = z.parent.parent.left;
                if (y.color) {
                    z.parent.color = false;
                    y.color = false;
                    z.parent.parent.color = true;
                    z = z.parent.parent;
                } else {
                    if (z == z.parent.left) {
                        z = z.parent;
                        rightRotate(z);
                    }
                    z.parent.color = false;
                    z.parent.parent.color = true;
                    leftRotate(z.parent.parent);
                }
            }
        }
        root.color = false;
    }

    public Node treeMinimum(Node x) {
        while (x.left != nil) {
            x = x.left;
        }
        return x;
    }

    public void delete(int key) {
        Node z = search(root, key);
        Node y = z;
        boolean yOriginalColor = y.color;
        Node x;
        if (z.left == nil) {
            x = z.right;
            transplant(z, z.right);
        } else if (z.right == nil) {
            x = z.left;
            transplant(z, z.left);
        } else {
            y = treeMinimum(z.right);
            yOriginalColor = y.color;
            x = y.right;
            if (y.parent == z) {
                x.parent = y;
            } else {
                transplant(y, y.right);
                y.right = z.right;
                y.right.parent = y;
            }
            transplant(z, y);
            y.left = z.left;
            y.left.parent = y;
            y.color = z.color;
        }
        if (yOriginalColor == false) {
            deleteFixup(x);
        }
    }

    public void deleteFixup(Node x) {
        while (x != root && x.color == false) {
            if (x == x.parent.left) {
                Node w = x.parent.right;
                if (w.color) {
                    w.color = false;
                    x.parent.color = true;
                    leftRotate(x.parent);
                    w = x.parent.right;
                }
                if (w.left.color == false && w.right.color == false) {
                    w.color = true;
                    x = x.parent;
                } else if (w.right.color == false) {
                    w.left.color = false;
                    w.color = true;
                    rightRotate(w);
                    w = x.parent.right;
                } else {
                    w.color = x.parent.color;
                    x.parent.color = false;
                    w.right.color = false;
                    leftRotate(x.parent);
                    x = root;
                }
            } else {
                Node w = x.parent.left;
                if (w.color) {
                    w.color = false;
                    x.parent.color = true;
                    rightRotate(x.parent);
                    w = x.parent.left;
                }
                if (w.right.color == false && w.left.color == false) {
                    w.color = true;
                    x = x.parent;
                } else if (w.left.color == false) {
                    w.right.color = false;
                    w.color = true;
                    leftRotate(w);
                    w = x.parent.left;
                } else {
                    w.color = x.parent.color;
                    x.parent.color = false;
                    w.left.color = false;
                    rightRotate(x.parent);
                    x = root;
                }
            }
        }
        x.color = false;
    }

    public Node search(Node x, int key) {
        if (x == nil || x.key == key) {
            return x;
        }
        if (key < x.key) {
            return search(x.left, key);
        } else {
            return search(x.right, key);
        }
    }

    public void transplant(Node u, Node v) {
        if (u.parent == nil) {
            root = v;
        } else if (u == u.parent.left) {
            u.parent.left = v;
        } else {
            u.parent.right = v;
        }
        v.parent = u.parent;
    }

    public void inorderTreeWalk(Node x) {
        if (x != nil) {
            inorderTreeWalk(x.left);
            System.out.print(x.key + " ");
            inorderTreeWalk(x.right);
        }
    }
}

