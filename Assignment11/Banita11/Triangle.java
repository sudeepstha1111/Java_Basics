package Banita11;

public class Triangle  extends Shape{
    int base;
    int height;

    public Triangle(int base, int height) {
        super("Triangle");
        this.base = base;
        this.height = height;
    }
    @Override
    public void area(){
        System.out.println("the area of triangle is "+ (base*height)/2);
    }
}
