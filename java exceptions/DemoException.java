public class DemoException{
    public static void main(String[] args){
        int i,j,k=0;
        i=5;
        j=0;
        try{
            k=i/j;
            System.out.println("k="+k);
        }
        catch(Exception e){
            System.out.println("Exception occured");
        }
        System.out.println(k);
        // The above program is unchecked exception.
        
    
    }
}