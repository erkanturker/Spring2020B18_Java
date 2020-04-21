package day26_ClassandObject.BankAccount;

import day28_StaticKeyword.staticMethods;

public class BankAccountObject {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        account1.AccountHolder="Erkan Turker";
        account1.AccountNumber=1234567891234567L;
        account1.ShowBalance();
        account1.Deposit(1000);
        account1.Deposit(4000);
        account1.WithDraw(3000);
        account1.WithDraw(2000);
        account1.ShowBalance();
        account1.WithDraw(2000);
        BankAccount  account2 = new BankAccount();
        account2.AccountSetUp("Gulsen Zehra",1111222233334444L );
        account2.ShowBalance();
        account2.Deposit(4000);
        account2.ShowBalance();

        BankAccount account3= new BankAccount("Ekrem",4444555511116364L,1000);
        account3.ShowBalance();

    }
}
