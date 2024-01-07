import java.util.Scanner;

class Node {
    Node left, right;
    int data;

    public Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class Tree_Creation {
    static Node Create() {
        Scanner sc = new Scanner(System.in);
        Node root = null;
        System.out.println("Enter data: ");
        int data = sc.nextInt();
        if (data == -1) {
            return null;
        }
        
        root = new Node(data);
        System.out.println("Enter left child of " + root.data);
        root.left = Create();
        System.out.println("Enter right child of " + root.data);
        root.right = Create();
        return root;
    }

    static void inorder(Node root) {
        if (root == null)
            return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    static void preOrder(Node root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    static void post_Order(Node root) {
        if (root == null)
            return;
        post_Order(root.left);
        post_Order(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        Node root = Create();
        preOrder(root);
        System.out.println(" ");
        inorder(root);
        System.out.println(" ");
        post_Order(root);
        System.out.println(" ");
    }
}
