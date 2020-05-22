package Banita11;

public class Shape{
    String name;
    int length;
    int width;

    public Shape(String name){
    }

    public Shape(String name, int length, int width) {
        this.name=name;
        this.length=length;
        this.width=width;
    }

    public void area() {
        System.out.println("The area of "+this.name+" is "+length*width);
    }
    public void perimeter(){
        System.out.println("the perimeter of "+this.name+ " is "+ 2*(width+length));

    }

}
