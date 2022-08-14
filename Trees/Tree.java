import java.util.*;

public class Tree {
    static Scanner sc = null;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Node root = createTree();
        // createTree();

        System.out.println();
        inorder(root);
        
        inorder(root);
        // LNR
        System.out.println();
        preorder(root);
        // NLR
        System.out.println();
        postorder(root);
        System.out.println();
        // LRN
        reverseroot(root);
        System.out.println();
        System.out.println("the maximum value " + treemax(root));
        System.out.println();
        System.out.println("The size is" + size(root));
        System.out.println("The sum is" + sum(root));

    }

    static Node createTree() {
        Node root = null;
        System.out.println("Enter data ");
        int data = sc.nextInt();
        if (data == -1) {
            return null;

        }
        root = new Node(data);
        System.out.println("Enter left for " + data);
        root.left = createTree();
        System.out.println("Enter right for " + data);
        root.right = createTree();
        return root;
    }

    static void inorder(Node root) {
        if (root == null) {
            return;

        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);

    }
   

    static void preorder(Node root) {
        if (root == null) {
            return;

        }
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }

    static void postorder(Node root) {
        if (root == null) {
            return;

        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data);
    }

    static void reverseroot(Node root) {
        if (root == null) {
            return;

        }
        reverseroot(root.left);
        reverseroot(root.right);

        root.left = root.right;
        root.right = root.left;
        System.out.println(root.data);
    }

    static int treemax(Node root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        int leftmax = treemax(root.left);
        int rightmax = treemax(root.right);
        int max = Math.max(root.data, Math.max(leftmax, rightmax));
        return max;
       

        // return max;

    }
    static int size(Node root){
        if(root == null){
            return 0;
        }
        int ls = size(root.left);
        int rs = size(root.right);
        int ts = ls + rs+1;
        return ts;
    }
    static int sum(Node root){
        int total=0;int leftsum=0;int rightsum=0;
        if (root == null) {
            return 0;
            
        }
        else{
            if(root.left!=null){
         leftsum = sum(root.left);
    } if (root.right!=null) {
        
    
         rightsum = sum(root.right);
    }
         total = leftsum + rightsum + root.data;
        return total;

    }
}
}
class Node {
    Node left, right;
    int data;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
