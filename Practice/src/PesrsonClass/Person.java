package PesrsonClass;

public class Person {
    private final String name;
    private final int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void greet(){
        System.out.println("Hello, my name is " + name + ", and I am " + age + " years old.");
    }
}
