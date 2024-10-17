package Exercise2;

public class Test {
    public static void main(String[] args) {
        Book book1 = new Book("The great", "Orwell", false);
        book1.borrow();
        book1.borrow();
        book1.returnItem();
    }
}
