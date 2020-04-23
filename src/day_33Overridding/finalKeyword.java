package day_33Overridding;

class Credentials{
    private final String UserName="ErkanTurker";
    private final String Password = "Ba123rwe";

   // We cant use set method with final Keyword but we can use get method
   /*
    public void setUserName(String UserName, String Password){
        this.UserName= UserName;
        this.Password = Password;
    }


    */

   public String getUserName(){ // we can use get method
       return UserName;
   }
}

class Holly{
   final public void printName ( ){
        System.out.println ("Erkan");
    }
}

public class finalKeyword extends Holly {

    public static void main (String[] args) {
       final String SSN= "12344567";
        // SSN="1234"; it will give us compile error. beceuse we declareed as an final
        System.out.println (SSN);
        final String DateofBrith;
        DateofBrith="eaeerer";
        System.out.println (DateofBrith);
    }

    /*
    public void printName(){
        System.out.println ("Asim");
    }
    // final can not be Changed
     */

    // final method can be overloading

    public final static void add(int a, int b){
        System.out.println (a+b);
    }
    public static void add(double a,double b){
        System.out.println (a+b);
    }
}
