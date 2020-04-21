package day10_Switch_Scanner;

public class SwitchStatement_Practice2 {
    public static void main(String[] args) {

        char chr='A';
        String result="";

        switch (chr){
            case 'A':
                System.out.println("A");
                result="A";
                break;
            case 'B':
                System.out.println("B");
                result="B";
                break;
            case 'C':
                System.out.println("C");
                result="C";
                break;
            case 'D':
                System.out.println("D");
                result="D";
                break;
            default:
                System.out.println("invalid");
                result="Invalid";
        }
        System.out.println(result);

    }

}
