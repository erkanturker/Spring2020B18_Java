package day_35Interface.Cars;

public class ToyotaHybrid implements Cars,ElectricVehicels,GasVehicles {


    @Override
    public void Start ( ) {
        System.out.println ("Push button");
    }

    @Override
    public void Charge ( ) {
        System.out.println ("charging");
    }

    @Override
    public void SelfDrive ( ) {
        System.out.println ("self driving");
    }

    @Override
    public void PumpGas ( ) {
        System.out.println ("pumbing gas");
    }
}
