package abstractClasses;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void sleep();

    public abstract void move();

    public abstract void makeSound();

    public void eat() {
        System.out.println("Animal eats");
    }
}
