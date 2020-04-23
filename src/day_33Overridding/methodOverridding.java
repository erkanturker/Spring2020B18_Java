package day_33Overridding;
class Student{
    public void name(){
        System.out.println ("My name is Erkan");
    }
    public void name(int a){
        System.out.println ("My name is Erkan int overload");
    }
    public void name(double b){
        System.out.println ("My name is Erkan double overload");
    }

}
public class methodOverridding extends Student {

    public void name(){
        System.out.println ("My name is Asim and I am overridng");
    }
    public static void main (String[] args) {
        methodOverridding obj= new methodOverridding ();
        obj.name ();

    }

}
