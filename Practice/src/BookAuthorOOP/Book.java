package BookAuthorOOP;

public class Book {

    private String title;

    Author author;

    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
    }

    public void getBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author.getName());
    }

}
