package day26_ClassandObject.Car;

import day26_ClassandObject.Car.Car;

public class CarObjects {
    public static void main(String[] args) {
        Car car1 =new Car();
        car1.Brand= "BMW";
        car1.Color= "White";
        car1.year=2016;
        car1.Mieage=60000;
        car1.price=45000;
        car1.Model="X6";
        System.out.println(car1.Brand + " " + car1.Model + " " + car1.Color + " " + car1.year + " " + " " + car1.Mieage + " "+ car1.price);

        Car car2 =new Car();
        car2.Brand= "Honda";
        car2.Color= "Gray";
        car2.year=2019;
        car2.Mieage=2000;
        car2.price=35000;
        car2.Model="Accord";
        System.out.println(car2.Brand + " " + car2.Model + " " + car2.Color + " " + car2.year + " " + " " + car2.Mieage + " "+ car2.price);

        car1.drive();
        car2.drive();

        car1.getInfo();
        car2.getInfo();
    }

}
