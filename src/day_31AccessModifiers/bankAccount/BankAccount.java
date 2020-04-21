package day_31AccessModifiers.bankAccount;
/*
WarmUp: creata a custom class for bankaccount

	The attributes/data that the class can have are:
			AccountHolder, AccountNumber, AvailableBalance

	Actions the class can do are:
			deposit, withdraw, checking balance

	requiremnets:
			1. apply encapsulations
			2. user should be able to deposit, withdraw and check the balance
				2.1 if the withdrawing account is greater than available balance, 35$ penalty fee will be charger from the account

				2.2 if the available balance is less or equal to 0, account holder won't be able to withdraw money

 */
public class BankAccount {
    private String AccountHolder;
    private long AccountNumber;
    private double AvailableBalance;

    public String getAccountHolder(){
        return AccountHolder;
    }
    public void setAccountHolder(String AccountHolder){
        this.AccountHolder=AccountHolder;
    }
    public long getAccountNumber(){
        return AccountNumber;
    }
    public void setAccountNumber(long AccountNumber){
        this.AccountNumber=AccountNumber;
    }
    public double getAvailableBalance(){
        return AvailableBalance;
    }
    public void setAvailableBalance(double AvailableBalance){
        this.AvailableBalance= AvailableBalance;
    }

    public void deposit(double amount){
        this.AvailableBalance+=amount;

    }

    public void withdraw(double amount){
        //2.1 if the withdrawing account is greater than available balance, 35$ penalty fee will be charger from the account
        //
        //				2.2 if the available balance is less or equal to 0, account holder won't be able to withdraw money
        if(this.AvailableBalance<=0){
            System.out.println("You dont have enoug money");
            return;
        }
        if(amount>this.AvailableBalance){
            this.AvailableBalance-=amount;
            this.AvailableBalance-=35;

        }
        else {
            this.AvailableBalance -= amount;
        }




    }
    public void getInfo(){
        System.out.println("Name: "+AccountHolder);
        System.out.println("Account Number: "+AccountNumber);
        System.out.println("Available Balance: "+AvailableBalance);

    }
    public void showBalance(){
        System.out.println(getAvailableBalance());
    }




}
