package day_32Inheritance.interitencePractice;
class Data{
    public int num1;
    protected int num2;
    public static int num3;
    private int num4;
    int num5;


}

public class Inheritence extends Data {
    public static void main(String[] args) {
        Inheritence obj=new Inheritence();
        System.out.println(obj.num3);


    }
}
