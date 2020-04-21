package day23_WrapperClassArrayList;
//ArrayList<ClassType> variableName = new ArrayList<ClassType>();

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListClass {

    public static void main(String[] args) {
        ArrayList<String> arrayList =new ArrayList<String>();
        arrayList.add("Erkan");
        arrayList.add("Turker");
        System.out.println();
        System.out.println(arrayList);
        System.out.println(Arrays.toString( arrayList.toArray()));


        ArrayList<Integer> list1 =new ArrayList<>();
        list1.add(10); // auto-boxing wrapper = primitive >>> autoboxing
        list1.add(20);
        list1.add(30);
        System.out.println(list1);
        System.out.println(list1.get(1));
        System.out.println(list1.size());

    }
}
