package LmsTask;

public class Triangle extends Shape{
    public Triangle(double a){
        super(a);
    }
    @Override
    public void getPerimeter(){
        System.out.println("Периметр треугольника равна "+(3*getA()));


    }
}
