package abstractClasses;

public class Goat extends Animal {

    public Goat(String name) {
        super(name);
    }

    @Override
    public void sleep() {
        System.out.println("Goat is sleeping");
    }

    @Override
    public void move() {
        System.out.println("Goat is moving");
    }

    @Override
    public void makeSound() {
        System.out.println("Goat is making a sound (Meeh meeh!)");
    }

}
