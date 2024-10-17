public abstract class  Book {
    private String title;
    private String description;
    private String publisher;
    private double price;
    private int year;

    //getter
    public String getTitle() {
        return title;
    }
    public String getDescription() {
        return description;
    }
    public String getPublisher() {
        return publisher;
    }
    public int getYear() {
        return year;
    }
    //setter
    public void setTitle(String title) {
        this.title = title;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public void setYear(int year) {
        this.year = year;
    }

    //Constructor
    public Book(String title, String description, String publisher, int year) {
        this.title = title;
        this.description = description;
        this.publisher = publisher;
        this.year = year;
    }

    //abstract method
    public abstract void setPrice(double price);
    public abstract String getGenre();

    @Override
    public String toString() {
        return "Title: " + title +
                "\nDescription: " + description +
                "\nPublisher: " + publisher +
                "\nYear: " + year;
    }
}
