package day_36_Polymorphisim.UDemyExamplePoly;


public class ProductManager {
    private BaseProductDao baseProductDao;

    public ProductManager (BaseProductDao baseProductDao) {
        this.baseProductDao = baseProductDao;
    }

    public void add (Product product) {
        baseProductDao.add ( product );
        System.out.println ( "Product Maneger Transaction" );
        System.out.println ( "Product name: " + product.getName () );

    }

}
