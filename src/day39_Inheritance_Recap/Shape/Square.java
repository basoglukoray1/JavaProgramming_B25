package day39_Inheritance_Recap.Shape;

public class Square extends Shape {

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side<=0){
            System.err.println("invalid side");
            System.exit(1); // there is a problem
        }
        this.side = side;
    }

    public Square( double side) {
        super("Square");
        setSide(side);
    }



    public double area() {
        return side*side;
    }


    public double perimeter() {
        return side*4;
    }


    public String toString() {
        return "Shape{" +
                "side='" + side + '\'' +
                " area='"+ area()+'\''+
                " perimeter='"+ perimeter()+'\''+
                '}';
    }
}
