package day_36_Polymorphisim.UDemyExamplePoly;

public class BaseProductDao {

    public void add(Product product){
        System.out.println ("Default DataBase "+product.getName ()+" was added");
    }
}
