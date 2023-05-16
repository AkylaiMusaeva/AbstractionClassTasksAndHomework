package classPractice;

public class Lamborgini extends Car{


    public Lamborgini(String model, String colour, int maxSpeed) {
        super(model, colour, maxSpeed);
    }

    @Override
    public void gas() {
        System.out.println("Catch me when you hear my lamborgini go vroom,vroom,vroom,vroom");
    }

    @Override
    public void brake() {
        System.out.println("He never brakes probably");

    }
}
