// package Arraylists;
import java.util.*;
public class Arraylists2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            ArrayList<Integer> list = new ArrayList<>();
            for (;;) {

                
            
            System.out.println("Enter 1 to add element , enter 2 to remove element, enter 3 to display element, enter 4 to exit:  ");
            int n = sc.nextInt();
            if (n==1) {
                System.out.println("Enter the number");
                int d = sc.nextInt();
                list.add(d);
                
            }if (n==2) {
                System.out.println("Enter the element to be removed");
                int r = sc.nextInt();
                if (list.contains(r)) {
                    int x = list.indexOf(r);
                    list.remove(x);

                    
                }else{
                    System.out.println("This value is not in the list");
                }
            
                
            }
            if(n==3){
                System.out.println(list);
            }if (n==4) {
                break;
                
            }
   }
        }
        System.out.println("Exited");

        
    }
    
}
