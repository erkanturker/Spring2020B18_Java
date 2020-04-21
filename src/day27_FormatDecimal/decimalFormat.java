package day27_FormatDecimal;
// formats the decimeals and returns string value
import java.text.DecimalFormat;

public class decimalFormat {

    public decimalFormat(){

    }
    public decimalFormat(String a){

    }
    public decimalFormat(int a){
        this();


    }
    public static void main(String[] args) {
        DecimalFormat format = new DecimalFormat("0.0000");
        double a =23.123132421212121212;
        String num1 = format.format(a);
        System.out.println(num1);
        double c =45.312131231313;
        System.out.println(c);
        System.out.println(format.format(c));
        c= Double.parseDouble(format.format(c));
        System.out.println(c);

    }
}
