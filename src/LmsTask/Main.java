package LmsTask;

public class Main {
    public static void main(String[] args) {
        /**Добавьте абстрактный метод
         public abstract double getPerimeter()
         в класс Shape. Реализуйте этот метод в 5 классах наследниках класса Shape.*/
        Shape rectangle=new Rectangle(2.4,3.2);
        rectangle.getPerimeter();
        Shape square=new Square(4);
        square.getPerimeter();
        Shape triangle=new Triangle(3);
        triangle.getPerimeter();
        Shape parallelogram=new Parallelogram(4,3);
        parallelogram.getPerimeter();
        Shape trapezoid=new Trapezoid(2,3,4,3);
        trapezoid.getPerimeter();




    }
}
