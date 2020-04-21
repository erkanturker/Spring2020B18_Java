package day23_WrapperClassArrayList;

public class warmup {
    public static void main(String[] args) {
        String str= madeof("aaaabbbcccddddxxxxxedddc");
        System.out.println(str);
        String str2= nonDuplicate("erkanturker");
        System.out.println(str2);
    }

    public static String madeof(String str){
        String result="";
        for (int i = 0; i < str.length(); i++) {

            if(!result.contains(""+str.charAt(i))){

                result+=""+str.charAt(i);
            }

        }
       return result;
    }

    public static String nonDuplicate(String str){
        String result="";
        for (int i = 0; i <str.length() ; i++) {
            int count=0;
            for (int j = 0; j <str.length() ; j++) {
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }

            }
            if(count==1){
                result+=""+str.charAt(i);
            }

        }
       return result;
    }
}
