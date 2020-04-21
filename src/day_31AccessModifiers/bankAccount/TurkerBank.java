package day_31AccessModifiers.bankAccount;

import java.util.ArrayList;

public class TurkerBank {

    public static void main(String[] args) {

        BankAccount erkan= new BankAccount();
        erkan.setAccountHolder("Erkan Turker");
        erkan.setAccountNumber(1234123412341234L);
        erkan.withdraw(100);
        erkan.showBalance();
        erkan.deposit(2000);
        erkan.showBalance();
        erkan.getInfo();
        BankAccount ekrem= new BankAccount();

        BankAccount[] accounts={erkan,ekrem};
        ArrayList<BankAccount> accountArrayList =new ArrayList<>();
         accountArrayList.add(erkan);
         accountArrayList.add(ekrem);
        System.out.println(accountArrayList);
        System.out.println(accounts[0]);


    }
}
