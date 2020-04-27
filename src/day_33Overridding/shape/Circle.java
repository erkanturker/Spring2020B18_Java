package day_33Overridding.shape;

public class Circle extends Shape {
    double radius;
    double diameter;
    final double PI = 3.14;
    public Circle(double radius){
        this.radius=radius;
        this.diameter=radius*2;

    }
    protected void Area(){
            double area = radius*radius*PI;
        System.out.println (area);
    }
    protected void Perimeter(){
        double perimeter = PI*diameter;
        System.out.println (perimeter);
    }
}
