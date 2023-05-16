package classPractice;

public class Toyota extends Car{
    public Toyota(String model, String colour, int maxSpeed) {
        super(model, colour, maxSpeed);
    }

    @Override
    public void gas() {
        System.out.println("Toyota has a good gas");
    }
    @Override
    public void brake() {
        System.out.println("Toyota brakes a lot");
    }
}
