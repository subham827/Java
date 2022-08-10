package Recursion.Sorting;
public class RealBubbleSort {
    public static void main(String args[]) {
        int [] a = {3,2,6,1,9,7};
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length-1-i; j++) {
                if(a[j+1]<a[j]){
                    int temp = a[j+1];
                    a[j+1]= a[j];
                    a[j] = temp;
                }
                
                
            }
        }
        for (int j = 0; j < a.length; j++) {
            System.out.println(a[j]);
            
        }
        
    }
    
    
}
