

public class Strings {
    public static void main(String[] args) {
        //   Strings cannot be overwritten 
        String name = " Subham   ";
        int x = name.indexOf("am");
        System.out.println(x);
        boolean r = name.contains("b");
        System.out.println(r);
        String q = "Aman";
        boolean y = name.equals(q);
        System.out.println(y);
        boolean o = name.isEmpty();
        System.out.println(o);
        name = name + "Dudheria" + "        ";
        System.out.println(name.trim());



        
    }
    
}
