public class SumPrime {
    public static void main(String[] args) {
        int n = 16;
        int m =0;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                if((i+j)==n){
                    if (isPrime(i)&&isPrime(j)) {
                        m++;
                        
                        break;

                        
                    }

                }
                
            }
            
        }if (m>0) {
            
            System.out.println("yes");
            System.out.println(m);
        }else{
            System.out.println("no");
        }
        
        
    }public static boolean isPrime(int n){
        for (int i = 2; i <= n/2; i++) {
            if (n%i==0) {
                return true;
                
            }
            
        }return false;

    }
    
}
