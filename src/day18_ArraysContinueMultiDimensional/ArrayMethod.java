package day18_ArraysContinueMultiDimensional;
import java.util.Arrays;
/*
rrays Utilities:
            Arrays class is presented in "java.util" package

        Arrays.toString(VariableName): it converts a array (single dimensional) to String value

            ARRAY MUST MUST BE CONVERTED TO STRING IN ORDER TO BE PRINTED

            Ex:
            int[] arr ={1,2,3,4};
            String str = Arrays.toString(arr);


        Arrays.sort(VariableName): sorts the values of array in Ascending order.
            Ex:
                int[] arr ={5,4,3,2,1};
                Arrays.sort(arr);
                arr ->{1,2,3,4,5}
                String[] arr ={"D","B","C"};
                Arrays.sort(arr);
                arr ->{"B","C","D"}
 */

public class ArrayMethod {
    public static void main(String[] args) {
        int[] number ={1,2,3,4,10,5,6,7};
        System.out.println(Arrays.toString(number));
        Arrays.sort(number);
        System.out.println(Arrays.toString(number));
        System.out.println("maximum "+number[number.length-1]);
        System.out.println("minumum "+ number[0]);

        String[] nameList ={"Ekrem","Asim","Zehra","Erkan"};
        Arrays.sort(nameList);
        System.out.println(Arrays.toString(nameList));

        int[] mynumber= {99,266,74,67,100,403,12};
        Arrays.sort(mynumber);
        int [] dsort= new int[mynumber.length];
        String str ="[";

        for (int i = mynumber.length-1; i >=0 ; i--) {

            str+=mynumber[i]+", ";


        }
        str=str.trim().substring(0,str.length()-2)+"]";
        System.out.println(str);
        int z=0;
        for (int i = mynumber.length-1; i >=0 ; i--) {  // 6 0 5 1 4 2
                    //(mynumber.length-1)-i
                    dsort[z]=mynumber[i];
                    z++;
                
            }
        System.out.println(Arrays.toString(dsort));


        }

    }

