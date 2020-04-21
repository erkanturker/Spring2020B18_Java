package day24_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrtoArrlistMethod {

    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5,6,7};
        returnArrList(arr);
        System.out.println(arr);
        System.out.println(returnArrList(arr));

        ArrayList<Integer> arrayList = MuhtarreturnArrList(arr);
        System.out.println("This is Muhtar's solution"+arrayList);

        int [] arr2 ={10,40,100,200,50};
        ArrayList<Integer> arrayList1= returnArrList(arr2);

        int max = maxNumber(arrayList1);
        int min = minNumber(arrayList1);
        System.out.println(max+" "+min);

    }

    public static ArrayList<Integer> returnArrList(int[] arr){

        Integer[] iarr = new Integer[arr.length];
        for (int i = 0; i <iarr.length ; i++) {
            iarr[i]= Integer.valueOf(arr[i]);
        }


        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(iarr));

return arrayList;
    }

    public static ArrayList<Integer> MuhtarreturnArrList(int[] arr){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int each: arr) {
            arrayList.add(each);
        }

        return  arrayList;

    }

    public static int maxNumber(ArrayList<Integer> arrayList){
        int max = Integer.MIN_VALUE;
        for (int each:arrayList) {
            if(each>max) max=each;

        }
     return max;
    }
    public static int minNumber(ArrayList<Integer> arrayList){
        int min = Integer.MAX_VALUE;
        for (int each:arrayList) {
            if(each<min) min=each;
        }
        return min;
    }
    public static int SecondminNumber(ArrayList<Integer> arrayList){
        Integer min = minNumber(arrayList);

        arrayList.remove(min);

        int seconmax= minNumber(arrayList);
        return seconmax;
    }

    public static int secondMax(ArrayList<Integer> arrayList){
        int max=maxNumber(arrayList);
        arrayList.removeAll(Arrays.asList(arrayList));
        int secondmax = maxNumber(arrayList);

        return secondmax;
    }
}
