package day25_Constructors;

public class Constructors {

    public Constructors(String a) {
        System.out.println("Default Constructor");

    }
    public Constructors(int b) {
        System.out.println("Default Constructor2");

    }
    public static void main(String[] args) {
        Constructors obj = new Constructors("A");
        Constructors obj1 = new Constructors(1);

    }

}
