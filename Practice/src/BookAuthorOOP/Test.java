package BookAuthorOOP;

public class Test {
    public static void main(String[] args) {
        Author author = new Author("George Orwell", "British");
        Book book = new Book("1984", author);
        book.getBookInfo();
    }
}
