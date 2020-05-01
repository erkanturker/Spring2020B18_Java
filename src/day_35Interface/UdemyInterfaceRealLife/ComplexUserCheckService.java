package day_35Interface.UdemyInterfaceRealLife;
//It will check user is older that 18 or not and name statrt wiht "Er" and return boolean
public class ComplexUserCheckService implements IUserCheckService{
    public boolean checkUser(User user){
        if (user.getAge ()>=18 && user.getName ().startsWith ( "Er" )){
            return true;
        }
        return false;
    }
}
