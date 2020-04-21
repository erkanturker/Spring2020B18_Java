package day26_ClassandObject.BankAccount;

public class BankAccount {

    /*

    reate a custom class for BankAccount

    attributes/data that can have are:
                    1. AccountHolder, 2. AccountNumber, 3. Balance

        Actions: deposit, withdraw, showBalance

        requiremnts:
            1. user should be able to deposit money into their account

            2. user should be able to withdraw money from their account

                    2.1 if the withdrawing account is greater than available balance, 35$ penalty charge will be added

                    2.2 if the balance is less than or equal to 0, user should not be able to withdraw money

            3. user should be able to see their balance

instance variable: declared in the class, outside of any methods (object variables)

instance methods: methods that does not have static specifier. does have return type. (object methods)


this. : used for calling the instance variables in an object instance
                (within the class)

            this. keyword we use it when the local variable has the same name with the instance variable

this(): used for calling the constructors
            (within the class)


     */

    String AccountHolder;
    long AccountNumber;
    double balance;
    public BankAccount(){


    }
    public BankAccount(String AccountHolder, long AccountNumber, double balance) {
        this.AccountHolder = AccountHolder;
        this.AccountNumber = AccountNumber;
        this.balance = balance;
    }

    public void ShowBalance(){
        System.out.println("-----------------------------------");
        String acct=""+AccountNumber;
        String AccountNumber= "**********"+acct.substring(12);
        System.out.println("Account Holder: "+ AccountHolder);
        System.out.println("Account Number: "+ AccountNumber);
        System.out.println("Available Balance: $"+balance);
        System.out.println("-----------------------------------");
    }
    public void Deposit(double amount){
        System.out.println("-----------------------------------");
        String acct=""+AccountNumber;
        String AccountNumber= "**********"+acct.substring(12);
        System.out.println("Deposting $"+amount+" to the account"+AccountNumber);
        balance+=amount;
        System.out.println("New Balance: $"+balance);
        System.out.println("-----------------------------------");
    }
    public void WithDraw (double amount){
        if(amount>balance){
            System.out.println("Invalid Amount ");
            return;
        }
        if(balance<=0){
            System.out.println("There is no available balance");
            return; // exiting from method
        }
        System.out.println("-----------------------------------");
        String acct=""+AccountNumber;
        String AccountNumber= "**********"+acct.substring(12);
        System.out.println("Withdrawing $"+amount+" from the account"+AccountNumber);
        balance-=amount;
        System.out.println("New Balance: $"+balance);



    }
    public void AccountSetUp(String name, long acctNum){
        AccountHolder=name;
        AccountNumber=acctNum;
    }


}
