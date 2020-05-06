package day_36_Polymorphisim.UDemyExamplePoly;

public class main {
    public static void main (String[] args) {


        ProductManager productManager = new ProductManager ( new MySqlProductDao ( ) );
        productManager.add ( new Product ( 2,"Apple",15 ) );

        System.out.println ("==============================================================");

        ProductManager productManager1 = new ProductManager ( new OracleProductDao ( ) );
        productManager1.add ( new Product ( 2,"Water",10 ) );



    }
}
