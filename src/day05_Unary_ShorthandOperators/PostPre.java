package day05_Unary_ShorthandOperators;

public class PostPre {
    public static void main(String[] args) {

        //pre changes the value immediately



        int a =100;

        System.out.println(++a);
        System.out.println(a);
        System.out.println(--a);
        System.out.println(a);
        int s =10;

        int f=s++;

        System.out.println(f+""+s);


    }

}
