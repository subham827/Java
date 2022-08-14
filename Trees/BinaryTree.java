import java.util.*;
class BinaryTree{

static class Node{
    int key;
    Node left,right;
}
    static Node newNode(int key)
    {
        Node node = new Node();
        node.key = key;
        node.left = node.right = null;
        return (node);


    }
  static  ArrayList<Integer> path;
  static ArrayList<Integer> path1;
  

    public static void main(String[] args){
        
        Node root = newNode(2);
        root.left = newNode(4);
        root.left.left = newNode(7);
        root.right = newNode(1);
        root.right.left = newNode(8);
        root.right.right = newNode(3);
        root.right.right.left = newNode(6);
        root.right.right.right = newNode(9);
        root.right.right.right.right = newNode(5);
        root.right.right.right.left = newNode(10);
        System.out.println(sum(root));
        levelOrder(root);
        path = new ArrayList<>();
        path1 = new ArrayList<>();
        System.out.println(find(root, 8));
        System.out.println(path);
        kleveldown(root, 2);
        klevelfar(root,3);
    


    }
    static int sum(Node root){
        if (root == null) {
            return 0;
            
        }
        int ls = sum(root.left);
        int rs = sum(root.right);
        int ts = ls+rs+root.key;
        return ts;
    }
    static void levelOrder(Node root){
        Queue<Node> mq = new ArrayDeque<>();
        mq.add(root);
        while(mq.size()>0){
            int count = mq.size();
            for (int i = 0; i < count; i++) {
                root = mq.remove();
                System.out.print(root.key + " ");
                if (root.left!=null) {
                    mq.add(root.left);

                    
                }if(root.right!=null){
                    mq.add(root.right);
                }
                
            }
            System.out.println();
        }

        
    }

    static boolean find(Node root,int data){
        if(root == null){
            return false;
        }
        if(root.key == data){
            path.add(root.key);
            return true;
        }
        boolean filc = find(root.left,data);
        if(filc){
            path.add(root.key);
            return true;
        }
        boolean firc = find(root.right,data);
        if(firc){
            path.add(root.key);
            return true;
        }
        return false;
    
    }
    static void kleveldown(Node root,int k){
        if (root == null || k<0) {
            return ;
            
        }
        if (k==0) {

            System.out.print(root.key + " ");
            
        }
     
     kleveldown(root.left, k-1);
     kleveldown(root.right, k-1);
    
    }
    static boolean klevelfar(Node root,int data){
        if(root == null){
            return false;
        }
        if(root.key == data){
            path.add(root.key);
            
            
            return true;
        }
        boolean filc = find(root.left,data);
        if(filc){
            path.add(root.key);
            return true;
        }
        boolean firc = find(root.right,data);
        if(firc){
            path.add(root.key);
            return true;
        }
        return false;

          
        
    }
}