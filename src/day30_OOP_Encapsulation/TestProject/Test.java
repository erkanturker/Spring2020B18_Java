package day30_OOP_Encapsulation.TestProject;

public class Test {
    public static void main(String[] args) {

        TestData obj= new TestData();
        // obj.name  we cant reach the field because is private
        //that why we are using get and setter

        String name = obj.getName();
        System.out.println(name);
        obj.setName("Asim");
        System.out.println(obj.getName());
    }
}
