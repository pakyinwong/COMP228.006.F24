package AnimalPoly;

public abstract class Animal implements SoundMaker {
    protected String name;
    public Animal(String name) {
        this.name = name;
    }
    public abstract void move();
}
