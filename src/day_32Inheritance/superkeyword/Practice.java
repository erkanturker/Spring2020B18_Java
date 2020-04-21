package day_32Inheritance.superkeyword;

class Parent {
    public Parent(int a){
        this(10.0);
        System.out.println("super");
    }
    public Parent(double b){
        System.out.println("Double Super");
    }
}

public class Practice  extends  Parent{

    public Practice ( ) {
        super ( 10 );
        System.out.println ( "sub" );

    }

    public static void main(String[] args) {
        Practice obj = new Practice();

    }


}
