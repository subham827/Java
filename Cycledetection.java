
public class Cycledetection {
    private static Node head;
    private static Node head1;
    private Node tail;
    public static int  size;
    private class Node {
        private int value;
        private Node next;
        public Node(int value) {
            this.value = value;
           
        }
        // public Node(int value, Node next) {
        //     this.value = value;
        //     this.next = next;
        // }
    }
    // Floyd's Cycle-Finding Algorithm
    public boolean hasCycle(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
   // find node at which the cycle begins
   Node detectfirstnode (Node head){
         Node slow = head;
         Node fast = head;
         while(fast!=null && fast.next!=null){
              slow = slow.next;
              fast = fast.next.next;
              if(slow == fast){
                break;
              }
         }
         if(fast == null || fast.next == null){
              return null;
         }
         slow = head;
         while(slow != fast){
              slow = slow.next;
              fast = fast.next;
         }
         return slow;
   }
   // intersection of 2 linked lists
   public Node getIntersectionNode(Node head2, Node head1) {
    while (head2 != null) {
       Node temp = head1;
       while (temp != null) {
           // if both Nodes are same
           if (temp == head2) {
               return head2;
           }
           temp = temp.next;
       }
       head2 = head2.next;
   }
   return null;
   
}
    public static void main(String[] args) {
        
    }
    
}
