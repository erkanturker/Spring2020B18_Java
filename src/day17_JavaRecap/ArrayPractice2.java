package day17_JavaRecap;

/*



 */

public class ArrayPractice2 {
    public static void main(String[] args) {

        String longestName="";

        String [] array={"Erkan","Asim","Ekrem","GulsenZehra"};
        for (int i = 0; i <array.length ; i++) {

            if(array[i].length()>longestName.length()){

                longestName=array[i];


            }

        }
        System.out.println(longestName);

    }
}
