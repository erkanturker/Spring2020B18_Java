package day26_ClassandObject.Car;

import java.time.Year;

public class Car {
    String Model;
    String Brand;
    String Color;
    int year;
    double price;
    long Mieage;

    public void drive(){
        System.out.println(Brand+" "+Model+" is being driving");

    }
    public void getInfo(){
        System.out.println(Brand+" "+Model+" "+Color+" "+year+" "+Mieage+" "+price);
    }




}
