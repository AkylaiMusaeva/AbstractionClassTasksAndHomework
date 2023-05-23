package LmsTask;

public abstract class Shape {
    private double a;
    private double b;
    private double c;
    private double d;

    public Shape(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public Shape(double a){
        this.a=a;
    }
    public Shape(double a,double b,double c,double d){
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
    }
    public Shape(){
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
    public void setC(double c){
        this.c=c;
    }
    public double getC(){
        return c;
    }
    public void setD(double d){
        this.d=d;
    }
    public double getD(){
        return d;
    }
    public abstract void getPerimeter();


}
