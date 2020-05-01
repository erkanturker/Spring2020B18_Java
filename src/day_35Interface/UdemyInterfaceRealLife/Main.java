package day_35Interface.UdemyInterfaceRealLife;

public class Main {
    public static void main (String[] args) {
        SignUpManger sign = new SignUpManger(new AgeUserCheckService());
        sign.signUp ( new User ( 1,"Asim",18 ) );

    }
}
