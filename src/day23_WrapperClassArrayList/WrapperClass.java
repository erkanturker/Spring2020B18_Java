package day23_WrapperClassArrayList;

public class WrapperClass {
    public static void main(String[] args) {
        int numInt =10;
        Integer numInteger=10;
        double numdouble=10d;
        Double numDouble =10d;
        numdouble=numDouble;  // primitive = wrapperClass unboxing

        Boolean BooleanResult =false;
        boolean booleanResult = BooleanResult; // unboxing primitive = wrapperClass

        char ch1 ='L';
        Character ch2=ch1; //autoBoxing wrapperclass = primitive

        Byte numByte=20;
        System.out.println(numByte.MIN_VALUE);

        int a =10;
        double b=a;
       // Double c =a; Gives us an error Double wrapper class is only dedicated fot double primitibe
        int A1 =  Byte.parseByte("19"); // no compile error primitive to primitive
        Integer A2= (int)Byte.parseByte("19"); //compile error without casting int




    }

}
