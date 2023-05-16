package LmsTask;

public class Trapezoid extends Shape{
    public Trapezoid(double a,double b,double c,double d){
        super(a,b,c,d);
    }
    public void getPerimeter(){
        System.out.print("Периметр трапеции равна ");
        System.out.println(getA()+getB()+getC()+getD());
    }
}
