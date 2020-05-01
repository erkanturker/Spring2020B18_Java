package day_35Interface;

import org.w3c.dom.ls.LSOutput;

public interface InterfaceVsAbstracClass {
    int a = 0; //it looks like public final static int a
    public abstract void method1();
    public abstract int method2();
    public void method3(); //abstract keyword given by default
    void method4();    //public abstract keyword given by default


}
class  test implements InterfaceVsAbstracClass{


    @Override
    public void method1 ( ) {

    }

    @Override
    public int method2 ( ) {
        return 0;
    }

    @Override
    public void method3 ( ) {

    }

    @Override
    public void method4 ( ) {

    }



    public static void main (String[] args) {
        System.out.println (InterfaceVsAbstracClass.a);
    }
}