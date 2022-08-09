import java.io.*;
public class DemoException3 {
    public static void main(String[] args) {
    
      int i,j,k=0;
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      i=9;
      
      
      try {
          j = Integer.parseInt(br.readLine());
          k = i/j;
          System.out.println("k is " +k);
         

        
      } 
      catch(IOException e){
          System.out.println("IOException");
      }
    //   catch(ArithmeticException e){
    //       System.out.println("ArithmeticException");
    //       System.out.println("Finally");
    //   }
     finally{
         System.out.println("Finally");}
    
        
        
      
     
      
      
        }
    
}
