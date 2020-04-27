package day_34Abstraction;

public class Cat extends Animal {

    public Cat (char gender, byte age, String color, String name) {
        super ( gender, age, color, name );
    }

    @Override
    public void speak ( ) {
        System.out.println (name+" say meow");
    }

    @Override
    public void sleep ( ) {
        System.out.println (name+" sleep 14 hour ");

    }

    @Override
    public void eat ( ) {
        System.out.println (name+" eats meat or other stuff");
    }

    @Override
    public void drinks ( ) {
        System.out.println (name+" drink water or milk");

    }


}
