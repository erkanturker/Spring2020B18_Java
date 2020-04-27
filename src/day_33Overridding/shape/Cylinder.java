package day_33Overridding.shape;

public class Cylinder extends Shape {
    double radius;
    double height;
    final double PI = 3.14;
    double diameter;
    public Cylinder(double radius, double height){
        this.radius=radius;
        this.height=height;
        this.diameter=radius*2;
    }
    protected void Area(){

        double area = (2*PI*radius*radius)+ (height*2*PI*radius);
        System.out.println (area);

    }
    protected void Perimeter(){
        double perimiter = 2 * (PI*diameter+height);
        System.out.println (perimiter);
    }
    protected void Capacity(){
        double capacity = (PI*radius*radius*height);
    }


}
