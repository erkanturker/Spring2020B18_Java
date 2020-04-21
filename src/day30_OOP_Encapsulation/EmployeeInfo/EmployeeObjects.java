package day30_OOP_Encapsulation.EmployeeInfo;

public class EmployeeObjects {
    public static void main(String[] args) {
        EmployeeInfo obj =new EmployeeInfo("Ekrem",12345678, (byte) 12,49500.500);
        System.out.println(obj.getAge());
        System.out.println(obj.getName());
        obj.setAge((byte) 14);
        obj.getAll();

    }
}
