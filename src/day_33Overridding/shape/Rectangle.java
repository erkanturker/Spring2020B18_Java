package day_33Overridding.shape;



public class Rectangle extends Shape {

    double lenght;
    double width;

    public Rectangle(double width,double lenght){
        this.width=width;
        this.lenght= lenght;
    }
    protected void Area(){
        double Area = lenght* width;
        System.out.println ("Area is "+Area);
    }
    protected  void Perimeter (){
        double perimeter= (lenght+width)*2;
        System.out.println (perimeter);
    }

}
