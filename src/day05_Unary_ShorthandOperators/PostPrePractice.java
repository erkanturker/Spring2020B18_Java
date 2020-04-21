package day05_Unary_ShorthandOperators;

public class PostPrePractice {
    public static void main(String[] args) {


        int x = 10;

        int y = x++;

                            //10        11          1

        System.out.println(y++ + "  " + x++ + "  " + y);
    }
}