package day_36_Polymorphisim.UDemyExamplePoly;

public class OracleProductDao extends BaseProductDao {



    public void add(Product product){
        System.out.println ("Oracle DataBase: "+product.getName ()+" was added");
    }

}
