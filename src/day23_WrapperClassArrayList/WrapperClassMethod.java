package day23_WrapperClassArrayList;

public class WrapperClassMethod {
    public static void main(String[] args) {

        // Showing or asigning max value of that primitive

        int maximum = Integer.MAX_VALUE;
        System.out.println(maximum);

        //

        //Returns the minumum value of primitve
        int minumum =Integer.MIN_VALUE;
        System.out.println(minumum);
        byte minByte=Byte.MIN_VALUE;
        System.out.println(minByte);

        //converts string values to primitve values, and it's not case sensitive
        Integer num1 = Integer.parseInt("123");// wrapper = primitibe >>>> auto-boxing
        System.out.println(num1+1);
        int num2 =Integer.parseInt("125"); // primitive =primivite
        System.out.println(num2+1);

        //parseByte ("strValue"):  takes the string and converts the string value to byte
       byte num3 = Byte.parseByte("124");
        System.out.println(num3+1);

        Byte num4 = Byte.parseByte("12"); //  wrapper = prinitive >>>>>>auto-boxing
        System.out.println(num4);

        Short num5 =Short.parseShort("123");  // wrapper = prinitive >>>>>>auto-boxing
        System.out.println();

        //ValueOf Converts String value to Wrapper Class values return wrapper classs
            int z     =       Integer.valueOf("1234"); //primitive =wrapper >>>>> unboxing
            Integer z1 = Integer.valueOf("12345"+3); // none wraper =wrapper //result 123453

        boolean reslt =Boolean.valueOf("True"); //primitive = wrapper >>>>unboxing
        System.out.println(reslt);

    }
}
