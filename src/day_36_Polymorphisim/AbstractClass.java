package day_36_Polymorphisim;

public abstract class AbstractClass {
    public static void ByLinkTest(){
        System.out.println ("Link Test Super");
    }

}

class Test extends AbstractClass{
    public static void ByLinkTest(){
        System.out.println ("Link Test Child");
    }

    public static void main (String[] args) {
        AbstractClass obj1 = new Test ();
        obj1.ByLinkTest ();
        Test  obj2 = new Test ();
        Test.ByLinkTest ();
        obj2.ByLinkTest ();
        ByLinkTest ();
    }
}
