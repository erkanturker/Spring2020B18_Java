package day_32Inheritance.superkeyword;
class A{
    public A(int a){

    }
    String name= "Erkan";
    public void methodA(){

    }
}
public class SuperKeyword extends A {
    public SuperKeyword(int a) {
        super(a);
    }

    public void method(){
        super.name="Ekrem";
        this.name="Asim";
        super.methodA();
    }

}
