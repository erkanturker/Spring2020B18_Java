package day_35Interface.UdemyInterfaceRealLife;
//It will check user is older that 18 or not and return boolean
public class AgeUserCheckService implements IUserCheckService {
    public boolean checkUser(User user){
        if(user.getAge ()>=18){
            return true;
        }
        return false;
    }
}
