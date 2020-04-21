package day24_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListaddallMethod {
    public static void main(String[] args) {
        //AddAll
        String [] pLanguage= {"Java", "Phyton"," C#"};

        ArrayList<String> allLanuages= new ArrayList<>();
        allLanuages.addAll(Arrays.asList("JavaScript","C++","Visual Basic")); //add whole list at same time
        allLanuages.addAll(Arrays.asList(pLanguage)); //We added obove there language as well
        System.out.println(allLanuages); //resuly is [JavaScript, C++, Visual Basic, Java, Phyton,  C#]
    }
}
