package day_33Overridding.shape;
/*
WarmUp:
	1. create a class called Shape
			Actions: Area(), perimeter(), capacity()

	2. create sub classes of Shape:
						Circle
						rectangle
						square
						cylinder
		and give the instance variables that are needed to calculate the Area, perimeter, and Volume of those shapes

	3. override super class' Area(), perimeter(), capacity() methods to the sub classes
 */

public class Square extends Shape {
    double side;
    public Square(double side){
        this.side=side;
    }

    protected void Area(){
        double area = side*side;
        System.out.println (area);
    }
    protected void Perimeter(){
        double perimeter =  side*4;
        System.out.println (perimeter);
    }

}
