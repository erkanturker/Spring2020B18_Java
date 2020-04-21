package day05_Unary_ShorthandOperators;

public class PrimitiveCasting {

    public static void main(String[] args) {
        // implicit casting
        int a =10;
        long b=a; // implicit casting is done automatically

        // b =10L

        int a1=100;

        long b1 = (long)a1; // manualy doing the implicit casting


        // explicit casting casting larger to smaller primitivies

        int iNum=100;
        byte bNum = (byte)iNum;

        double dNum =5.5;

        float fNum = (float)dNum;




    }
}
