package AnimalPoly;

public class Bird extends Animal {
    public Bird() {
        super("Bird");
    }
    @Override
    public void move() {
        System.out.println("Bird move");
    }
    @Override
    public void makeSound() {
        System.out.println("Bird makeSound");
    }
}
