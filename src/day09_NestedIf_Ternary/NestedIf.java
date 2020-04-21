package day09_NestedIf_Ternary;

public class NestedIf {
    public static void main(String[] args) {
        boolean UsCitizen=false;
        int age =17;
        if(UsCitizen){

            if(age>17){
                System.out.println("You are eligible");
            }
            else{
                System.out.println("You must be 18 or older to able to vote");
            }


        }

        else{
            System.out.println("Ony Us Citizen can vote for the Election of President");
        }

    }
}
