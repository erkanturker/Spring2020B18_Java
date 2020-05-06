package day_36_Polymorphisim.UDemyExamplePoly;

public class MySqlProductDao extends BaseProductDao {


    public void add(Product product){
        System.out.println ("MySql DAtaBase: "+product.getName ()+" was added");
    }

}
