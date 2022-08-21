
public class Varargs {
    public static void main(String[] args) {
        fun(2,3,4,5,6,7);

        
    }
    static void fun(int ...v){
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < v.length; i++) {
            sum+= v[i];
            if (max<v[i]) {
                max = v[i];
                
            }

            
        }
        System.out.println(sum);
        System.out.println(max);
    }
    
}
