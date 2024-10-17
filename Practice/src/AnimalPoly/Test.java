package AnimalPoly;

public class Test {
    public static void main(String[] args) {
        Animal animal[] = {new Dog(), new Bird()};
        for (Animal a : animal){
            a.makeSound();
            a.move();
        }
    }
}
