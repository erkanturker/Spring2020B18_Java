package day19_ForEachLoop;

import java.util.Arrays;

public class WarmupMuhtarSolution {
    public static void main(String[] args) {
        String a="aabbbccc", b="bbbaaabcccccccccccc";
        String a1= "";
        String b1="";
        for (int i = 0; i <a.length() ; i++) {
            int count =0;
            for (int j = 0; j <a.length() ; j++) {

                if(!a1.contains(a.substring(j,j+1))){

                    a1+=a.substring(j,j+1);
                }

            }
        }
        for (int i = 0; i <b.length() ; i++) {
            if(!b1.contains(b.substring(i,i+1))){
                b1+=b.substring(i,i+1);
            }
        }
        char[] ch1 =a1.toCharArray();
        char[] ch2=b1.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        System.out.println(a1);
        System.out.println(b1);
        String str1=Arrays.toString(ch1);
        String str2=Arrays.toString(ch2);
        System.out.println(str1);
        System.out.println(str2);

        System.out.println((str1.equals(str2))?true:false);





    }
}
