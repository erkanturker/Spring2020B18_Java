package day13_Loop;

/*
1. find the sum of all the numbers between 1 to 1000
2. find the sum of the  even numbers between 1 to 1000
3. find the sum of the  odd numbers between 1 to 1000
 */
public class task02 {

    public static void main(String[] args) {

        //task02
        int sum1 = 0;
        for (int i = 0; i <=1000 ; i++) {
            sum1+=i;
        }
        System.out.println("total sum of 1 to 1000 is "+sum1);

        //task02
        int sum2 =0;
        for (int i = 0; i <=1000 ; i++) {

            if(i%2==0){
                sum2+=i;
            }

        }

        //task03
        System.out.println("total sum of even number from 1 to 1000 is "+sum2);
        int sum3 =0;
        for (int i = 1; i <=1000 ; i+=2) {
                sum3+=i;
        }
        System.out.println("total sum of odd number from 1 to 1000 is "+sum3);
    }

}
