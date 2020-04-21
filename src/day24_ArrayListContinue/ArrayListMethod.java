package day24_ArrayListContinue;

import java.util.ArrayList;

public class ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> shoppinglist = new ArrayList<>();
        shoppinglist.add("Orange");
        shoppinglist.add("Grape");
        shoppinglist.add("Apple");
        System.out.println(shoppinglist);
        shoppinglist.add(3,"Strawberry");
        System.out.println(shoppinglist);

        ArrayList<Integer>numbers= new ArrayList<>();
        numbers.add(0,2);
        numbers.add(1,25);
        numbers.add(2,10);

        numbers.clear();
        System.out.println(numbers);
    }
}
