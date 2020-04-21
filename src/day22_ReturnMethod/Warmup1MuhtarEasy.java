package day22_ReturnMethod;

public class Warmup1MuhtarEasy {



    public static void main(String[] args) {

        String str ="AAAAABBBBBCCCCDDDFFAA";
        String result="";


        for (int i = 0; i <str.length() ; i++) {
            int count=0;
            for (int j = 0; j <str.length() ; j++) {
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            result+=""+str.charAt(i)+count;
            str=str.replace(""+str.charAt(i),""); //aFter counting first index we are removin duplicates

        }
        System.out.println(result);

    }

}
