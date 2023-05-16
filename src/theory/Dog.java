package theory;

import theory.Animal;

public class Dog  extends Animal {
    public Dog(String name, int age, String colour) {
        super(name, age, colour);
    }


    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void standardMethod() {
        super.standardMethod();
    }

    @Override
    public void abstractMethod() {
        System.out.println("Abstract method");
    }

}

