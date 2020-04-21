package day09_NestedIf_Ternary;

public class Ternary_Practice {
    public static void main(String[] args) {
        char ch1= '-';
        int number =100;
        if(number>0){
            ch1='+';
        }
        else if(number<0){
            ch1='-';
        }
        else {
            ch1='0';
        }
        char ch2=(number>0)?'+' :(number<0)?'-':'0';
        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println("===========================");

        byte score=10;
        String grade = (score>=90&&score<=100)?"Excellent":(score>=80&&score<90)?"Great"
                :(score>=70&&score<=80)?"Great" :(score>=60&&score<=70)?"Pass"
                :(score<60&&score>0)?"FAIL":"Invalid";
        System.out.println(grade);


    }
}
