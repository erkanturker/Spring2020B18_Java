package day28_StaticKeyword;

public class staticVariables {
     static String name;

    public static void main(String[] args) {
        staticVariables obj1 = new staticVariables();
        obj1.name="Omer";
        staticVariables obj2 = new staticVariables();
        System.out.println(obj2.name); // static variable only have one copy //result is Omer not null
        obj2.name="Erkan";
        System.out.println(obj1.name);// We will see Erkan instead of Omer

    }
}
