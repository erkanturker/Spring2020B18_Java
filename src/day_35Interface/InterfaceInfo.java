package day_35Interface;



public interface InterfaceInfo {
    int a = 100;
    public abstract void methodA ( );

     public static void staticMethod ( ) {

    }
    public default void defaultMethod(){

    }

    public static void main (String[] args) {
        staticMethod ();


    }

}

interface Data{


    public abstract void methodData();

}

class Test implements InterfaceInfo,Data{

    public void methodA(){

    }

    public void methodData(){}

    public static void main (String[] args) {

    }
}