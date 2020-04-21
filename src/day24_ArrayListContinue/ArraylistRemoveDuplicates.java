package day24_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//  1. write a return method that can remove the duplicated objects from an Integer arraylist
public class ArraylistRemoveDuplicates {

    public static void main(String[] args) {
        ArrayList< Integer > arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList(1, 2, 3, 4, 1, 4, 5, 3, 6,15, 7, 12,12,12,1,5,6,7,2,15,16));
        System.out.println(RemoveDuplicateArray1(arrayList));
        System.out.println(ErkanNonDuplicateArray(arrayList));
        ArrayList<String> arrayListString = new ArrayList<>(Arrays.asList("Erkan","Erkan","Muhtar", "Asim","Asim"));
        System.out.println(arrayListString);
        System.out.println(RemoveDuplicateArray(arrayListString));
        Collections.sort(arrayList);
        Collections.sort(arrayListString);
        System.out.println(RemoveDuplicateArray1(arrayList));
        System.out.println(RemoveDuplicateArray(arrayListString));



    }

    public static ArrayList<Integer> RemoveDuplicateArray1(ArrayList<Integer> arrayList){
        ArrayList<Integer> narrayList= new ArrayList<>();
        for (Integer each: arrayList) {
            if(!narrayList.contains(each)) narrayList.add(each);
        }
        return narrayList;
    }
    public static ArrayList<String> RemoveDuplicateArray(ArrayList<String> arrayList){
        ArrayList<String> narrayList= new ArrayList<>();
        for (int i = 0; i <arrayList.size() ; i++) {
            if(!narrayList.contains(arrayList.get(i))){
                narrayList.add(arrayList.get(i));
            }
        }
        return narrayList;
    }

    public static ArrayList< Integer > ErkanNonDuplicateArray(ArrayList< Integer > arrayList) {
            ArrayList<Integer> narrayList= new ArrayList<>();
            for (int i = 0; i < arrayList.size(); i++) {
                int count = 0;
                for (int j = 0; j < arrayList.size(); j++) {
                    if (arrayList.get(i)==arrayList.get(j)) {
                       count++;
                    }
                }
                if(count==1){
                    narrayList.add(arrayList.get(i));

                }
            }
        return narrayList;
    }
}