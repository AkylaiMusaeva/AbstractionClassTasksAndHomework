package LmsTask;

public class Rectangle extends Shape{
    public Rectangle(double a, double b) {
        super(a, b);
    }

    @Override
    public void getPerimeter() {
        System.out.println("Периметр прямоугольника равна "+(2*(getA()+getB())));
    }


}
