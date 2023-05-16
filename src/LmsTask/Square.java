package LmsTask;

public class Square extends Shape{
    public Square(double a){
        super(a);
    }
    @Override
    public void getPerimeter(){
        System.out.println("Периметр квадрата равен "+(4*getA()));
    }
}
