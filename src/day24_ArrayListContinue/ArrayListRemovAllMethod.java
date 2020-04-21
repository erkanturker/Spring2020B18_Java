package day24_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

// removeAll(Interface): remoevs all the matching objects
public class ArrayListRemovAllMethod {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,1,1,1,1,3,4,1,1,1,4,5,5));
        System.out.println(numbers);
        numbers.removeAll(Arrays.asList(1));
        System.out.println(numbers);
    }
}
