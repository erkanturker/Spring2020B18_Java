package day_35Interface;
interface B {
    void methodB1();

}
public interface ExtendsVsImplements extends B {
    void method1();
    void method2();
    // We will have methodB1 here but we cant see //That s why we added methodB
}
class A implements ExtendsVsImplements{

    @Override
    public void methodB1 ( ) {
        // T
    }

    @Override
    public void method1 ( ) {

    }

    @Override
    public void method2 ( ) {

    }

    class C extends A  implements B,ExtendsVsImplements { // we must start with extend and than impelement otherwirse will get an error


    }
}