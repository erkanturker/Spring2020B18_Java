package day_36_Polymorphisim;

public class Zoo {
    public static void main (String[] args) {
        Tiger tiger1= new Tiger ();
        Tiger[] tigers ={tiger1};

        Octopus octopus1 =new Octopus ();
        Octopus[] octopi = {octopus1};

        Animal animal = new Tiger();
        Animal animal2 = new Octopus ();


    }
}
class Animal{
    public void talk(){

        System.out.println ("Animal is talking");
    }

}
class Tiger extends Animal{
    @Override
    public void talk ( ) {
        System.out.println ("Tiger is talking >>>RoaR");
    }

    public void Hunt(){
        System.out.println (" Tiger is hunting");
    }

}
class Octopus extends Animal{
    public void talk(){
        System.out.println ("Octopus is talknig >> gulugulu");
    }

    public void Swim(){
        System.out.println ("Octopus is swimming ");
    }

}

