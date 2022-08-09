public class DemoException1 {
    public static void main(String[] args) {
      int a[] = new int[4];
      int i=8;
      int c=2;
      int k=0;

      try {
          k = i/c;

          for (int j = 0; j <=a.length; j++) {
              a[j] = j+1;
              
          }
          for (int j : a) {
              System.out.println(j);
              
          }
      } catch (ArithmeticException e) {
          //TODO: handle exception
          System.out.println(e);
      }
      catch(ArrayIndexOutOfBoundsException e) {
          System.out.println("Maximum value is 4");
      }
      
      System.out.println(k);
        }
    
}
