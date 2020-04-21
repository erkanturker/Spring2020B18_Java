package day22_ReturnMethod;

public class Warmup1 { public static void main(String[] args) {
    String fTest= "AAAABBBBACCCCCCCCDDDDCCDDDDD";
    String fresult="";
    String nresult="";

    for (int i = 0; i < fTest.length(); i++) {
        int count =0;
        for (int j = 0; j < fTest.length() ; j++) {
            if(fTest.substring(i, i + 1).equals(fTest.substring(j, j + 1))){
                count++;
            }
        }

        fresult+=""+fTest.substring(i,i+1)+count;

    }
    System.out.println();
    System.out.print(fresult);
    System.out.println();

    for (int i = 0; i <fresult.length(); i+=2) {
        if(!nresult.contains(fresult.substring(i,i+2))){
            nresult+=fresult.substring(i,i+2);
        }

    }
    System.out.println(nresult);




}
}
