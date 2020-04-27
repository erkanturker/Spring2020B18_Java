package day_34Abstraction;



public class Zoo {
    public static void main (String[] args) {
        Cat meow = new Cat ('M',(byte)5,"Black","Meow");
        meow.getInfo ();
        System.out.println ("==================================");
        Cat misha = new Cat ('F', (byte)5,"Yellow","Misha");
        misha.getInfo ();
        misha.drinks ();
        misha.eat ();
        misha.sleep ();
        misha.speak ();
        System.out.println ("==================================");
        Dog cont = new Dog ( 'M',(byte)3,"Black and Yellow","Cont" );
        cont.getInfo ();
        cont.drinks ();
        cont.eat ();
        cont.sleep ();
        cont.speak ();
        System.out.println ("==================================");
        Cow sariKiz = new Cow ( 'F',(byte)2,"Yellow","Sari Kiz" );
        sariKiz.getInfo ();
        sariKiz.speak ();
        sariKiz.sleep ();
        sariKiz.eat ();
        sariKiz.drinks ();
        //We can create array list what we create as class name
        Cat[] cats = {misha,meow,};
        cats[1].getInfo ();

    }
}
