package day_32Inheritance.superkeyword;

class B{

    public B(){
        System.out.println("Super Constructor");
    }
}

public class defaultConstructor  extends  B{
    public defaultConstructor(){
        //super(); Imaginine we have default constructor here event if we did not call
        System.out.println("sub Constructor");
    }

    public static void main(String[] args) {

        defaultConstructor obj = new defaultConstructor();
    }

}
// without calling object we can t see the constuctor
//Result is Super Constructor
//          sub Constructor
// the first parent class constructor calls and sub
