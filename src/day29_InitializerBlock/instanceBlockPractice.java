package day29_InitializerBlock;

public class instanceBlockPractice {
    public String name="Asim";
    {
        name="Ekrem";
    }
    static {
        System.out.println("Zehra"); //static load first
        // we cant reacah name because static accept only static
        
    }
    public instanceBlockPractice(){
        name="Erkan";
    }

    public static void main(String[] args) {
        instanceBlockPractice obj =new instanceBlockPractice();
        System.out.println(obj.name); /* "Asim/Ekrem/Erkan */
    }

}
