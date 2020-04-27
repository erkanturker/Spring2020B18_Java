package day_34Abstraction;
/*
create sub classes of the Animal and override those actions:

					dog: Speak()	==> woof
						 Sleep()	==> 8 hours
						 Eat()		==> KFC
						 Drinks()	==> Milk Shake

					Cat: Speak()	==> meow
						 Sleep()	==> 14 hours
						 Eat()		==> m&m
						 Drinks()	==> Hot chocolate

					cow: Speak()	==> moo
						 Sleep()	==> 5 hours
						 Eat()		==> grace
						 Drinks()	==> Coffee with sugar

		create  zoo class and store some of those animals' objects
 */

public abstract class Animal {

    public char gender;
    public byte age;
    public String color;
    public String name;

    public Animal(char gender, byte age, String color, String name){
        this.gender=gender;
        this.age= age;
        this.color= color;
        this.name=name;
    }

    public abstract void speak ();
    public abstract void sleep();
    public abstract void eat();
    public abstract void drinks();

    public void getInfo(){
        System.out.println (" Nickname is "+ name);
        System.out.println (" Gender is "+gender);
        System.out.println (" Color is "+color);
        System.out.println (" Age is "+age);
    }


}
