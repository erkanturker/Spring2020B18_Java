package Replit;


import java.util.Arrays;

public class CombineName {
    public static void main (String[] args) {
      String[]  first_names = {"bob","joe"};
       String[] last_names = {"jones","smith"};

       String [] fullname= combineNames ( first_names,last_names );
        System.out.println ( Arrays.toString (fullname));

        int[] a = {1,2,3,4,5};
        mystery(a);
        for(int e : a)
        {
            System.out.print(e + " ");
        }

    }

    public static String[] combineNames(String[] first_names, String[] last_names)
    {
        String [] combine = new String[first_names.length];
        int index=0;
        for (int i = 0; i <combine.length ; i++) {
            combine[i]=first_names[i]+" "+last_names[i];
        }


        return combine;
    }

    public static void mystery(int[] array) {
        for (int i = 0; i <array.length ; i++) {
            if(array[i]%2==0)array[i]=array[i]/2;
            else array[i]=array[i]*10;
        }

    }
}
