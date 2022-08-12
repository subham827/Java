package Arraylists;
import java.util.*;
public class Arraylists {
    public static void main(String[] args) {
        ArrayList<Integer>  list = new ArrayList<>(10);
        list.add(67);
        list.add(8);
        list.add(67);
        list.add(8);list.add(67);
        list.add(8);list.add(67);
        list.add(8);list.add(67);
        list.add(8);list.add(67);
        list.add(8);list.add(67);
        list.add(8);
        // System.out.println(list);
        System.out.println(list.contains(8));
        list.set(0, 99);
        list.remove(2);
        System.out.println(list.size());
        System.out.println(list);
        for (int i = 0; i < 5
        ; i++) {
            System.out.println(list.get(i));
            
        }
        



        

       
    
}



        
    
    
}
