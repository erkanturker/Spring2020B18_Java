package day22_ReturnMethod;

/*
Frequence Test (AAAABBBBACCCCCCCCDDDDCCDDDDD)
outPut:A5B4C10CD9
 */

public class Warmup1Muhtar_solution {
    public static void main(String[] args) {

        String str="AAAABBBBACCCCCCCCDDDDCCDDDDD";
        String removeDup="";
        String countletter="";
        //First we will find out non duplicates
        for (int i = 0; i <str.length() ; i++) {
            if(!removeDup.contains(str.substring(i,i+1))){
                removeDup+=str.substring(i,i+1);
            }
        }
        System.out.println(removeDup);

        //Compare str and removeduplicates
        //if they match increase the count for first index i remove then make it 0
        for (int i = 0; i <removeDup.length() ; i++) {
            int count =0;
            for (int j = 0; j <str.length() ; j++) {
                if(removeDup.substring(i,i+1).equals(str.substring(j,j+1))){
                    count++;
                }

            }
            countletter+=removeDup.substring(i,i+1)+""+count;

        }
        System.out.println(countletter);
    }


}
