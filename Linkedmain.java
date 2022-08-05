public class Linkedmain {
    private static Node head;
    
    private Node tail;
    public static int  size;
    private class Node {
        private int value;
        private Node next;
        public Node(int value) {
            this.value = value;
           
        }
      
    }
    public void adddataatfirst(int value){
        Node node = new Node(value);
        if(tail == null){
            tail = head;
        }
        
            node.next = head;
            head = node;
        
        size ++;
    }
    public void adddataatlast(int value){
        Node node = new Node (value);
        // by tail
        if(head == null){
            head = node;
            tail = node;
        }
        tail.next = node;
        tail = node;

        size++;
        // without tail you need to traverse the whole list until head.next==null. 
    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
    }
    public void addatanypos(int value,int index){
     if(index<=size && index>=0)  { Node node = new Node(value);
        int i = 0;
        Node temp = head;
        if(index == 0){
            adddataatfirst(value);
        }
        else
       { while(i<index-1){
            temp = temp.next;
            i++;

        }
        node.next = temp.next;
        temp.next = node;
        }
        size++;
    
    }

       
    }
    public boolean deleteavalue(int value){
        Node temp = head;
        if(size==0){
            return false;
        }
        if(value == head.value){
            head = head.next;
            size--;
            return true;
        }
        while(temp.next!=null){
            if(temp.next.value == value){
                temp.next = temp.next.next;
                size--;
                return true;
            }
            temp = temp.next;

        }
        return false;

        

    }
    public void sortlist(){
        Node temp = head;
        while(temp!=null){
            Node next = temp.next;
            while(next!=null){
                if(temp.value > next.value){
                    int tempvalue = temp.value;
                    temp.value = next.value;
                    next.value = tempvalue;
                }
                next = next.next;
            }
            temp = temp.next;
        }
    }
    public void pop(){
        if(head==null){
            return;
        }
      head =   head.next;
      size--;
        

    }
   public Node reverse(){
         Node prev = null;
         Node current = head;
         while(current!=null){
              Node temp = current.next;
              current.next = prev;
              prev = current;
              current = temp;
         }
         
         return prev;
   }
   Node reversebyrec (Node head){
         if(head == null || head.next == null){
              return head;
         }
         Node newhead = reversebyrec(head.next);
         head.next.next = head;
         head.next = null;
         return newhead;
   }
 
   Node middle (Node head){
    Node slow = head;
    Node fast = head;
    while(fast !=null && fast.next !=null){
        slow = slow.next;
        fast = fast.next.next;
    }
    return slow;
   }
    public static void main(String[] args) {
        Linkedmain list = new Linkedmain();
        list.adddataatfirst(2);
        list.adddataatfirst(1);
        list.adddataatlast(3);
        list.adddataatfirst(4);
        list.addatanypos(5, 2);
        list.addatanypos(6, 2);
        System.out.println(size);
        list.display();
        list.pop();
        System.out.println();
        // list.deleteavalue(5);
        list.sortlist();
        
        list.display();
        System.out.println();
        list.reverse();
        list.display();
        System.out.println();
        list.reversebyrec(head);
        list.display();
       
       
    }
}