package Recursion.Sorting;
import java.util.*;
public class Quicksort2
 {
    public static void main(String[] args) {
        int a[] = {2,82,7,5,55,4,6};
        
        quicksort(a,0,a.length-1);
        printArray(a);
         
    }
    static int partition(int []a,int low, int high){
     int pivot = a[low];
        int i = low;
        int j = high;
        while (i<j) {
            
            while(a[i]<=pivot && i<high){
                i++;
            }
            while(a[j]>=pivot && j>low){
                j--;
            }
            if (i<j) {
                // swap
                swap(a, i, j);

                
            }
        }
        // swap
        swap(a, j, low);
        return j;
    
    }
    static void swap(int []a,int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    static void quicksort(int[] a,int low, int high){
        if (low<high) {
            int pivot = partition(a,low,high);
            quicksort(a,low,pivot-1);
            quicksort(a,pivot+1,high);
        
    
        }
        
    
        
    }
    static void printArray(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    
}
