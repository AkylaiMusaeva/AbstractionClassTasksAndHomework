package theory;

public  abstract  class Animal {
    private String name;
    private int age;
    private String colour;

    public Animal(String name, int age, String colour) {
        this.name = name;
        this.age = age;
        this.colour = colour;
    }
    public Animal(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    public void standardMethod(){
        System.out.println("Standard method");

    }
    public abstract void abstractMethod();

}
