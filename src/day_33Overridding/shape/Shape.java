package day_33Overridding.shape;

public class Shape {
    protected void Area(){
        System.out.println ("Area is 0");
    }
    protected void Perimeter(){
        System.out.println ("Perimeter is 0");
    }
    protected void Capacity (){
        System.out.println ("Capacity is 0");
    }

    public static void main (String[] args) {
        Rectangle rectangle = new Rectangle (10,20);
        rectangle.Area ();
        rectangle.Perimeter ();

        Square square = new Square ( 12 );
        square.Area ();

        Circle circle = new Circle ( 10 );
        circle.Area ();
        circle.Perimeter ();

        Cylinder cylinder = new Cylinder ( 12,12 );
        cylinder.Area ();
        cylinder.Capacity ();
        cylinder.Perimeter ();
    }
}
