package day11_Scanner_String;
//We called this litreals Declaration.If you created an objcet
// that object will be saved at String Pool(String pool does not take
//duplicate
//Those 3 variables above showin same location in the memory
//When the string object created with new keyword
//it will be saved somewhere in heap memory
//thats why follwoing is false;
/*
2. String represent the sequence of characters ====> "abcde"
    each character in String has its own index number
    index numbers start from 0
    String str="Erkan";
    index number 01234

3.String is immutable once you declare it  you cannot change it


 */


public class StringClass {

    public static void main(String[] args) {

        String str="Erkan"; //We called this litreals Declaration.If you created an objcet
                            // that object will be saved at String Pool(String pool does not take
                            //duplicate
        String str2="Erkan";

        String str3="Erkan";  //Those 3 variables above showin same location in the memory

        System.out.println(str==str2);


        String str4=new String("Erkan"); //When the string object created with new keyword
                                                //it will be saved somewhere in heap memory
                                                //thats why follwoing is false;



        System.out.println(str==str4);

        String str5=new String("Erkan");

        System.out.println(str4==str5);

        //heap memroy all the objects are stroe at
        //String pool: Located in heap mememory strores all string literals object

        //the output above also false becasue new keyword create another
        // object and save diffent location at heap memory




    }
}
