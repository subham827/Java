import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoException2 {
    public static void main(String[] args) {
    
      int i,j,k=0;
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      i=9;
      
      
      try {
          j = Integer.parseInt(br.readLine());
          k = i/j;

        
      } 
      catch(IOException e){
          System.out.println("IOException");
      }
      catch(ArithmeticException e){
          System.out.println("ArithmeticException");
      }
      catch(Exception e){
          System.out.println("Exception");
      }
      
     
      
      
      System.out.println(k);
        }
    
}
