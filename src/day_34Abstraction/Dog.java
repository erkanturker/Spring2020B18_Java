package day_34Abstraction;

public class Dog extends Animal {
    public Dog(char gender,byte age,String color,String name){
        super(gender,age,color,name);
    }
    public void speak(){
        System.out.println (name+" says woof");

    }
    public void sleep(){
        System.out.println (name+" sleeps 8 hours");
    }
    public void eat(){
        System.out.println (name+" eats meat and chicken");
    }
    public void drinks(){
        System.out.println (name+" drinks water");

    }
}
