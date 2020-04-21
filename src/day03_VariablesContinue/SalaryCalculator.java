package day03_VariablesContinue;

public class SalaryCalculator {
    public static void main(String[] args) {
        double rate =55;
        double stateTax=0.04;
        double federalTax=0.22;
        byte weeklyhours=40;
        double gross=rate*weeklyhours*52;
        double totalTax=(gross*stateTax)+(gross*federalTax);

        System.out.println("your Salary is $"+gross);
        System.out.println("Your Total Tax is $"+totalTax);
        System.out.println("Your income after tax $"+(gross-totalTax));

    }
}

