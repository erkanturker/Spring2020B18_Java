package day_35Interface.UdemyInterfaceRealLife;

public class SignUpManger {
    private IUserCheckService iUserCheckService; //We declare we This we want Whotoever IuserCheck service either AgeUser or ComplexUserCheckService

    public SignUpManger (IUserCheckService iUserCheckService) {
        this.iUserCheckService = iUserCheckService; // We must send IuserCheck service either AgeUser or ComplexUserCheckService
                                                    //When we want to
    }



    public void signUp(User user){

        if (iUserCheckService.checkUser ( user )){
            System.out.println ("User is Registered");
        }
        else System.out.println ("User could not Registered");


    }
}
