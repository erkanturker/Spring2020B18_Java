package day_35Interface.Cars;

public class Tesla_Model3 implements Cars,ElectricVehicels {
    public void Start(){
        System.out.println ("Voice Control \"Tesla Start \"");
    }
    public void Charge (){
        System.out.println ("charging");
    }
    public void SelfDrive(){
        System.out.println ("pumbing gas");
    }

}
