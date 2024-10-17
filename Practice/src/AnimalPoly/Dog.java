package AnimalPoly;

public class Dog extends Animal {
    public Dog() {
        super("Dog");
    }
    @Override
    public void move() {
        System.out.println("Dog move");
    }

    @Override
    public void makeSound() {
        System.out.println("Dog makeSound");
    }
}
