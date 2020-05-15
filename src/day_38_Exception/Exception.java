package day_38_Exception;

public class Exception {


    public static void main (String[] args) {

        try{
            System.out.println (9/0); //this is artihmatic runtime error
        }
        catch (ArithmeticException e){
            System.out.println ("This is Catch Block");
        }finally {
            System.out.println ("This is finally Block"); // finally block works with try&catch Block
                                                            // when finally statment work right after try or catch
        }
    }
}
