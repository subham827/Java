import java.util.*;

import javax.lang.model.util.ElementScanner14;

// import javax.lang.model.util.ElementScanner14;
public class SPA{
    public static void main(String [] args){
        int c=0; int d=0;
        for (int i=0;i<9;i++){
        int n;
        System.out.println("Enter 0 for stone, 1 for paper and 2 for scissor");
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        Random rand= new Random();
        int rand1= rand.nextInt(3);
        System.out.println(rand1);
        if(n==1 && rand1==2){
        System.out.println("You lost");
        d++;
        }
        
        else if(n==1 && rand1==1)
        System.out.println("Tie");
        else if(n==1 && rand1==0){
        System.out.println("You won");
        c++;}
        else if(n==2 && rand1==2)
        System.out.println("Tie");
        else if(n==2 && rand1==0){
        System.out.println("You lost");
        d++;}
        else if (n==2 && rand1==1){
        System.out.println("You won");
        c++;}
        else if (n==0 && rand1==2){
        System.out.println("You won");
        c++;}
        else if (n==0 && rand1==0)
        System.out.println("Tie");
        else {
        System.out.println("You lost");
            d++;
        }
        
        }if(c>d)
        System.out.println("Congrats you won , you scored " + c + " points");
        else if(c==d)
        System.out.println("Tie match");
        else 
        System.out.println("You lost , you scored " + c + " points");
    }
}



