package day20_CustomMethod;
import java.util.Arrays;
public class ArrayBubleSort {
    public static void main(String[] args) {
        int [] numbers={10,20,0,4,5,60,90};
        int temp; // we will keeping temp for next number
        boolean fixed = false;

        while (fixed==false) {
            fixed=true;

            for (int i = 0; i < numbers.length - 1; i++) {

                if (numbers[i] > numbers[i + 1]) {
                    temp = numbers[i + 1];
                    numbers[i + 1] = numbers[i];
                    numbers[i] = temp;
                    fixed = false;
                }


            }
        }
        System.out.println(Arrays.toString(numbers));

    }
}
