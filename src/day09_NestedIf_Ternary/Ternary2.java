package day09_NestedIf_Ternary;

public class Ternary2 {

    public static void main(String[] args) {
        int age=20;

        boolean eligibilty = (age>=21)?true:false;

      /*  if(age>=21){

            eligibilty=true;
        }
        else{
            eligibilty=false;
        }
        */
        System.out.println(eligibilty);

        System.out.println("==============");

        int ageOfPerson =20;
        String eligbleVote="";
        if(ageOfPerson>=18){
            eligbleVote="YES";
        }
        else{
            eligbleVote="NO";
        }
        System.out.println(eligbleVote);

        String eligiblevote2= (ageOfPerson>=18)?"YES":"NO";
        System.out.println(eligiblevote2);
    }
}
