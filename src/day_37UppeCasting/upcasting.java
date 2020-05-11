package day_37UppeCasting;
class Animal{
void methodA(){
    System.out.println ("Method Parent A");
}
}
class Dog extends Animal{
    void methodA(){
        System.out.println ("Method child  A");
    }
    void methodB(){
        System.out.println ("Method B");
    }
}

public class upcasting {
    public static void main (String[] args) {
        Dog obj1 = new Dog ();
        Animal obj2 = (Animal)obj1;
        obj2.methodA ();



    }
}
