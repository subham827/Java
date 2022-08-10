package Recursion.Sorting;
import java.util.Arrays;

public class Insertionsort1 {
    public static void main(String[] args) {
        int a[] = {8,4,1,5,9,2};
        a = insertionsort(a);
        System.out.println(Arrays.toString(a));
    }
    static int[] insertionsort(int[] a){
        for (int i = 1; i < a.length; i++) {
            int j = i;
            while(j>0 && a[j]<a[j-1]){
                swap(a, j, j-1);
                j--;
            }
        }
        return a;
    }
    static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    
}
