package day29_InitializerBlock;

import java.util.ArrayList;
import java.util.Arrays;

public class staticBlockPractice {

    public static String name;
    public static int[] arr;
    public static ArrayList<String> stringArrayList=new ArrayList<>();

    static {
        name="Suna";
        arr=new int[5];
        stringArrayList.add("Coffe");
    }
    public staticBlockPractice(){
        name="Asim";stringArrayList.add("Hello");
    }
    static {
        name="Erkan";
        arr=new int[4];
        stringArrayList.add("break");
    }
    static {
        name="Zehra"; //
        arr=new int[3];
        stringArrayList.add("please ");
    }

    public static void main(String[] args) {
        System.out.println(stringArrayList);
        System.out.println(Arrays.toString(arr));
        staticBlockPractice obj= new staticBlockPractice(); //static block is executed at compile time itself where as constructor
        // is executed just before the creation of object that is after run time of program.//that's way we get resul Asim
        System.out.println(name); // null
        System.out.println(stringArrayList);

    }
}
