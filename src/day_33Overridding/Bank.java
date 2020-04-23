package day_33Overridding;

public class Bank {

    public void InterestRate ( ){
        System.out.println ("interest rate 9 percent");
    }

    public static void main (String[] args) {
        BankofAmerica boA=new BankofAmerica ();
        boA.InterestRate ();
        Chase ch= new Chase ();
        ch.InterestRate ();
        CapitalBank cp = new CapitalBank ();
        cp.InterestRate ();
    }

}

class BankofAmerica extends Bank{
public void InterestRate(){
    System.out.println ("7 interest rate for BankofAmerica");
}
}

class Chase extends Bank{
    public void InterestRate(){
        System.out.println ("6 Intrest ratre for Chase bank");

    }

}
class CapitalBank extends Bank{
    public void InterestRate(){
        System.out.println ("4 Interest Rate for Capital Bank");
    }

}
