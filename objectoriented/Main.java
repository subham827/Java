package objectoriented;
import java.util.*;

public class Main{
    public static class Person {
        int age;
        String name;
        void saysHi(){
            System.out.println(name + "" + age+ "" + " hi");
        }
    }
    public static void main(String[] args) {
        Person p1= new Person();
        Person p2 = new Person();
        p1.age = 10;
        p1.name = "sam";
        p1.saysHi();
        p2.saysHi();
        Person p3 = p1;
        p3.name = "p";
        p3.age = 2;
        p3.saysHi();
        p1.saysHi();
    }
}