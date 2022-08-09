import java.io.*;
public class DemoException4 {
    public static void main(String[] args) throws Exception {
        String str = "";
    
        try( BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){

             str = " ";
           
            str = br.readLine();
        }
        // buffered reader becomes input output operations , whenever we have io operation all the object become resource so we have to close it so here we are creating a try block with resource,so no catch required above Java 1.7
      System.out.println(str);

        
    }
    
}
