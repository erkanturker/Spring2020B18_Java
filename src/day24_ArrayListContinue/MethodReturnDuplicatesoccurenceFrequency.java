package day24_ArrayListContinue;

public class MethodReturnDuplicatesoccurenceFrequency {
    public static void main(String[] args) {
        String str="aaafffcccdddwwweeewwweeweweweeeeee";
        System.out.println(removeDup(str));
        System.out.println(Frequency(str));

    }
    public static String removeDup(String a){
        String result= "";
        for (int i = 0; i <a.length() ; i++) {
            if(!result.contains(a.substring(i,i+1))){
                result+=a.substring(i,i+1);
            }

        }


        return result;
    }
    public static int Occurance(String a, String b){
      //  String Result="";
     //   String na= removeDup(a);
        int count =0;
        for (int i = 0; i <a.length() ; i++) {
            if(a.charAt(i)==b.charAt(0)){
                count++;
            }


        }
        /*
        while (a.contains(b)){
            count++;
            a.replaceFirst(b,"");

        }

        return count;
         */
        return count;

    }
    public static String Frequency (String a) {

        // Approach find how many time nondub accorur and add the number
        String Result = ""; //     AABBCC
        String na = removeDup(a); //ABC
        for (int i = 0; i <na.length() ; i++) {
            int count= Occurance(a,""+na.charAt(i));
            Result+=""+na.charAt(i)+count;

        }



        return Result;




        /*
        for (int i = 0; i <na.length() ; i++) {
            int count = 0;
            for (int j = 0; j <a.length() ; j++) {
                if(na.substring(i,i+1).equals(a.substring(j,j+1))){
                    count++;
                }

            }
            Result+=na.substring(i,i+1)+""+count;

        }
          return result;
         */

    }

}
