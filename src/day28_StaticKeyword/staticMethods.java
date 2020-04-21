package day28_StaticKeyword;

public class staticMethods {
    static int num1;
    int num2;

    public static void main(String[] args) {
        System.out.println(num1);
        System.out.println(staticMethods.num1); // we can call this because it belonfs to the class
       // System.out.println(num2); it gave us an error we cant reach instance variables because it belogns to the oject
       // System.out.println(staticMethods.num2);it gave us an error we cant reach instance variables because it belogns to the oject
        // when you type method only show upp method 1 because its belongs to this class
        method1();//if we have inside same class we can call by its name onlu
        staticMethods.method1(); // we can call like that too.
        // method2();it gave us an error we cant reach instance variables because it belogns to the oject
        //We need to create an object

        staticMethods obj = new staticMethods();
        obj.method2(); // now we can get method2
        obj.method1(); // we can reach static method via object but it gave us an suggestion


    }

    private static void method1(){
        System.out.println("a");
        //num1=0; tatic methods only accepts static members
        //n order to call none static in a static method we MUST call it though the object
        staticMethods obj1 = new staticMethods();
        obj1.num2=0;

    }
    public void method2(){
        System.out.println("b");
        num1=0;num2=0; // we can call both withoud getting an error.
    }


}
