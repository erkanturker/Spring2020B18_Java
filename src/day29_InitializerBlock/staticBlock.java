package day29_InitializerBlock;

public class staticBlock {
    static  int num; //This is defauly only visible in packeage if we want to reach outside of the package we should add public
    int num2;
    public staticBlock(){

        System.out.println("This is a Constructor"+num+num2);
    }
    static {
        System.out.println("Static Block"+num);//WE COUDL REACH NUM2 BECAUSE ONYL WE CAN ACCSESS STATIC KEYWORD
    }
    static {
        System.out.println("Second Static Block");
    }

    public static void main(String[] args) {
        staticBlock obj= new staticBlock();
        staticBlock obj2= new staticBlock();
        System.out.println("Main Method");
    }
}
