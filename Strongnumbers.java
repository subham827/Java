public class Strongnumbers {

     public static void main(String[] args) {
            int n = 145;
            for (int i = 1; i <=n; i++) {
               
           
                
                int l,fact,j;
                int sum = 0;
                int temp = i;
            
                while(temp>0){
                    j=1;
                    fact = 1;
                     l = temp%10;
                     while (j<=l) {
                         
                         fact = fact*j;
                         j++;
                     }
                   sum+= fact;
                    temp= temp/10;
                }if (sum==i) {
                    System.out.println(i);
                    
                }
            }
        
    }
   

}
