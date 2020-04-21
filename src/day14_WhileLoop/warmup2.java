package day14_WhileLoop;
/*
write a java program
that can remove duplicated values from String:
EX:input: aabbcc output: abc

 */
public class warmup2 {
    public static void main(String[] args) {
    String str ="aaabbbbcccc";
    String result ="";
        for (int i = 0; i <str.length() ; i++) {

            if(!result.contains(str.substring(i,i+1)))
            {
                result+=str.substring(i,i+1);

            }


        }
        System.out.println(result);
        String result2="";

        for (int i = 0; i <str.length() ; i++) {

            if(!result2.contains(""+str.charAt(i))){
                result2+=str.charAt(i);

                //we are comparing empty string and string we it has duplicate
                // if emty string does not have the contains one it will add
                // for i =0      charat(0)= a result2 does have a and it will add
                //              !result2.contains(""+str.charAt(i))
                // for i =1      charat(1)= a result2  have a and it will not add
                //                //              !result2.contains(""+str.charAt(i))



            }
        }
        System.out.println(result2);

    }
}
