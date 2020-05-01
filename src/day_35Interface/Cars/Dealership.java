package day_35Interface.Cars;

public class Dealership {
    public static void main (String[] args) {
        Tesla_Model3 obj1= new Tesla_Model3 ();
        obj1.Charge ();
        obj1.Start ();
        obj1.SelfDrive ();
        Jeep_Wrangler obj2= new Jeep_Wrangler ();
        obj2.PumpGas ();
        obj2.Start ();
        ToyotaHybrid obj3 = new ToyotaHybrid ();
        obj3.Charge ();
        obj3.PumpGas ();
        obj3.Start ();
        obj3.SelfDrive ();


    }
}
