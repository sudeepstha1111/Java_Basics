package Banita11;

import java.awt.geom.Area;

public class Program {
    public static void main(String[] args) {
        Square sq1 = new Square(8);
        sq1.area();
        Rectangle rectangle= new Rectangle(3,9);
        rectangle.perimeter();
        rectangle.area();
        Triangle triangle= new Triangle(6,1);
        triangle.area();
    }
}
