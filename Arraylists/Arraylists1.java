// package Arraylists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Arraylists1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter the numbers");
        for (int i = 0; i < n; i++) {
            int d = sc.nextInt();
            if (!(list.contains(d))) {
                
                list.add(d);
            }


            
        }
        Collections.sort(list);
        System.out.println(list);

        
    }
    
}
