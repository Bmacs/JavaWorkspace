package BinaryTreeRecursion;

import sun.reflect.generics.tree.Tree;

import javax.xml.soap.Node;

public class IntBST {

    protected IntBSTNode root;

    public IntBST() {
        root = null;
    }

    protected void visit(IntBSTNode p) {
        System.out.println(p.key + " ");
    }

    public void insert(int el) {
        IntBSTNode p = root;
        IntBSTNode prev = null;

        while (p != null) {
            prev = p;
            if (p.key < el)
                p = p.right;
            else
                p = p.left;
        }

        if (root == null)
            root = new IntBSTNode(el);

        else if (prev.key < el)
            prev.right = new IntBSTNode(el);
        else
            prev.left = new IntBSTNode(el);
    }

    public IntBSTNode search(IntBSTNode p, int el) {
        while (p != null)
            if (el == p.key)
                return p;
            else if (el < p.key)
                p = p.left;
            else
                p = p.right;

        return null;
    }

    public void breadthFirst() {
        IntBSTNode p = root;
        Queue queue = new Queue();

        if (p != null) {
            queue.enqueue(p);
            while (!queue.isEmpty()) {
                p = (IntBSTNode) queue.dequeue();
                visit(p);
                if (p.left != null)
                    queue.enqueue(p.left);
                if (p.right != null)
                    queue.enqueue(p.right);
            }
        }
    }

    protected void inorder(IntBSTNode p) {
        if (p != null) {
            inorder(p.left);
            visit(p);
            inorder(p.right);
        }
    }

    public void deleteByMerging(int el) {
        IntBSTNode tmp, node, p = root, prev = null;

        while (p != null && p.key != el) {
            prev = p;
            if (p.key < el)
                p = p.right;
            else
                p = p.left;
        }

        node = p;

        if (p != null && p.key == el) {
            if (node.right == null)
                node = node.left;

            else if (node.left == null)
                node = node.right;

            else {
                tmp = node.left;
                while (tmp.right != null)
                    tmp = tmp.right;

                tmp.right = node.right;
                node = node.left;
            }
            if (p == root)
                root = node;
            else if (prev.left == p)
                prev.left = node;
            else
                prev.right = node;
        }
        else if (root != null)
            System.out.println("key " + el + " is not in the tree");
        else
            System.out.println("The tree is empty");
    }

    public void traverse(Node root) {
      
    }

    public static void main(String[] args) {
        IntBST mytree = new IntBST();

        mytree.insert(13);
        mytree.insert(10);
        mytree.insert(2);
        mytree.insert(12);
        mytree.insert(25);
        mytree.insert(20);
        mytree.insert(31);
        mytree.insert(29);

        System.out.println("Tree's inorder before deleting leaf 31.");
        mytree.inorder(mytree.root);
        mytree.deleteByMerging(31);
        System.out.println("\nTree's inorder after deleting leaf 31.");
        mytree.inorder(mytree.root);
    }
}
