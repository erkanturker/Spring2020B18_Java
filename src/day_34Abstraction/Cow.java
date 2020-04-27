package day_34Abstraction;

public class Cow extends Animal {
    public Cow(char gender, byte age, String color,String name){
        super(gender,age,color,name);
    }
    @Override
    public void speak(){
        System.out.println (name+" speaks moo");
    }

    @Override
    public void sleep(){
        System.out.println (name+" sleeps 7");
    }
    @Override
    public void eat(){

        System.out.println (name+" eats grass ");
    }

    @Override
    public void drinks ( ) {
        System.out.println (name+" drinks water");
    }
}
