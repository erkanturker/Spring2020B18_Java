package day16_Arrays;

public class warmup {

    /*
    write a program that can find the unique characters from a String.
    Ex:input:AAABCDEEFF
    output:BCD
     */

    public static void main(String[] args) {
        String str= "AAASSSSSSSSSSSSSSSSSSsmF";
        String unique="";



        for (int i = 0; i <str.length() ; i++) {
            int count=0;

            for (int j = 0; j <str.length() ; j++) {

                if(str.substring(j,j+1).equals(""+str.charAt(i)) ){   //if((""+str.charAt(i)).equals(""+str.charAt(j)) ){
                    count++;           // Basically inner loop finding occurence number if it is more than one we will not show
                }
            }
            if (count==1){ //if the array occured 1 one time other wise do not work

                unique+=""+str.charAt(i);
            }

        }
        System.out.println(unique);

    }

}
