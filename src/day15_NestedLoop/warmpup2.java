package day15_NestedLoop;
/*
write a program that can check if the String is plaindrome.
 if it's print "true", otherwise print "false"    DO NOT USE FOR LOOPE
 x: input: leveloutput: true,  (because reversed value is still "level")

 */


public class warmpup2 {
    public static void main(String[] args) {
        String str="level";
        String strReverse="";
        int i =str.length()-1;
        while (i>=0){

            strReverse+=str.charAt(i);
            i--;
        }
        if(str.equals(strReverse)){

            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

        //Muhtar's Code
        int j=str.length()-1;
        String strReverse1="";
        while (j>=0){
            strReverse1+=str.substring(j,j+1);
            j--;
        }

        boolean result=str.equals(strReverse1);
        System.out.println(result);

    }
}
