package day_35Interface.Cars;

public class Jeep_Wrangler implements Cars,GasVehicles{

    public void Start(){
        System.out.println ("Push button");
    }


    public void PumpGas ( ) {
        System.out.println ("pumbing gas");
    }
}
