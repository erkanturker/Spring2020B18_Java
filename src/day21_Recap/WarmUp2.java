package day21_Recap;

/*
3. Write a method that can sort array desecent
4. Write a method that accepts 3 parameters: 2 numbers and one operator
ex calculation (10,20,"/)

 */

import java.util.Arrays;

public class WarmUp2 {
    public static void main(String[] args) {
        int[] arr = {10,2,3,5,50};
        SortDes(arr);
        Calculator(10,5,"a");
    }



    public static void Calculator(int num1, int num2, String operator){
        String result="";
        if(operator.equals("-")){
            result+=(num1-num2);
        }
        else if(operator.equals("+")){
            result+=(num1+num2);
        }
        else if(operator.equals("*")){
            result+=(num1*num2);
        }
        else if(operator.equals("/")){
            result+=(num1/num2);
        }
        else if(operator.equals("%")){
            result+=(num1%num2);
        }
        else {
            result+=" Invalid Operator";
        }
        System.out.println(result);
        String result2="";
        result2 +=(operator.equals("-"))?(num1-num2):(operator.equals("+"))?(num1+num2):
        (operator.equals("/"))?(num1/num2):(operator.equals("*"))?(num1*num2):
                (operator.equals("%"))?(num1%num2):"Invalid Operator";
        System.out.println(result2);
    }


    public static void SortDes (int[] array){
        Arrays.sort(array);
        for (int i = array.length-1; i >= 0; i--) {
            System.out.print(array[i]+" ");
        }
    }

}
