package day19_ForEachLoop;

/*
For each loop:
    The for-each loop is used to access each value in a collection of values.  it's a loop that's already been iterated

        The main usage of for each is iterating over collection classes or arrays.

        for(DataType  each:  Arrayname ){


            }
 */
public class forEachLoop {

    public static void main(String[] args) {

        int[]array={1,2,3,4,5,6,7};

        for(int each:array){
            System.out.print(each);
        }
        System.out.println();

        String [] array2={"Erkan","Turker","CyberTek"};
        for(String each: array2){

            System.out.println(each);
        }

        for(int a: array){

            if(a%2==0){
                System.out.print(a);
            }

        }




    }
}
