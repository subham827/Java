package objectoriented.OOPs;

public class MainClass {
    public static void main(String[] args){
        System.out.println("Helloworld");
        Person p1 = new Person();
        p1.age = 45;
        p1.name = "Subham";
        System.out.println(p1.age + " " );
        System.out.println(p1.name);
        p1.walk();
    }
    
}

class Person{
    String name;
    int age;
    void walk(){
        System.out.println(name+ " is Walking");
    }
}
