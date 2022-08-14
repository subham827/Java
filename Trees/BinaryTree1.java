import java.util.*;
class BinaryTree1{

static class Node{
    int key;
    Node left,right;

     Node (int key, Node left,Node right)
    {
     this.key = key;
     this.left = left;
     this.right = right;


    }
}
public static class Pair {
    Node node;
    int state;
    Pair(Node node, int state){
        this.node = node;
        this.state = state;
    }
}
    public static void main(String[] args){
        Integer[] arr = {50,25,12,null,null,37,30,null,null,null,75,62,null,70,null,null,87,null,null};
        Node root = new Node(arr[0], null, null);
        Pair rtp = new Pair(root, 1);
        Stack<Pair> st= new Stack<>();
        st.push(rtp);
        int idx=0;
        while(st.size()>0){
            Pair top = st.peek();
            if (top.state==1) {
                idx++;
                if (arr[idx] !=null) {
                    top.node.left  = new Node(arr[idx], null, null);
                    
                    Pair lp = new Pair( top.node.left,1);
                    st.push(lp);
                    
                }else{
                    top.node.left = null;
                }
                top.state++;
                
            }else if(top.state == 2){
                idx++;
                if (arr[idx] !=null) {
                    top.node.right  = new Node(arr[idx], null, null);
                    
                    Pair rp = new Pair( top.node.right,1);
                    st.push(rp);
                    
                }else{
                    top.node.right = null;
                }
                top.state++;

            }else{
                st.pop();
            }

        } 
        // display(root); 
        // createLeftClone(root);  
        System.out.println(createLeftClone(root).right.key); 
        System.out.println(treemax(root));   
      int diameter1 = 0;
      diameter1 = diameter(root);
        System.out.println(diameter1);
       
    }
    public static void display(Node node){
        if (node == null) {
            return;
            
        }
        String str = "";
        str += node.left ==null?"." : node.left.key + "";
        str+= "<-" + node.key + "->";
        str += node.right == null?"." : node.right.key + "";
        System.out.println(str);
        display(node.left);
        display(node.right);

    }
    static Node createLeftClone(Node root){
        if (root == null) {
            return null;
            
        }
        Node lcr = createLeftClone(root.left);
        Node rcr = createLeftClone(root.right);
        Node nn = new Node(root.key,lcr,null);
         root.left = nn;
        root.right = rcr;
        return root;


    } static int treemax(Node root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        int leftmax = treemax(root.left);
        int rightmax = treemax(root.right);
        int max = Math.max(root.key, Math.max(leftmax, rightmax));
        return max;
       

        

    }static int height(Node root){
        if(root == null){
            return 0;

        }
        int lm = height(root.left);
    
        int rm = height(root.right);
        
        if (lm>rm) {
            return lm+1;
            
        }else
        return rm+1;
        
        
}static int diameter(Node root){
    if(root == null){
        return 0;

    }
    int ld = diameter(root.left);
    int rd = diameter(root.right);
    int f = height(root.right)+height(root.left)+2 ;
    int ff = Math.max(f, Math.max(ld, rd));
    return ff;

}
}