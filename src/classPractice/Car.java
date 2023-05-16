package classPractice;

public abstract class Car {
    private String model;
    private String colour;
    private int maxSpeed;

    public Car(String model, String colour, int maxSpeed) {
        this.model = model;
        this.colour = colour;
        this.maxSpeed = maxSpeed;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public abstract void gas();
    public abstract void brake();
}
