package day_33Overridding;

class A{
     protected void methodA(){
        System.out.println ("Method A");
    }
    public String methodS(){
         return "b";
    }
}

public class AccessModifier extends A {

     public void methodA ( ){
        System.out.println ("Method A");
    }

     public String methodS(){
         return "V";
    }
}
