package LmsTask;

public class Parallelogram extends Shape{
    public Parallelogram(double a,double b){
        super(a,b);
    }
    @Override
    public void getPerimeter(){
        System.out.println("Периметр параллеограмма равна "+(2*(getA()+getB())));
    }
}
