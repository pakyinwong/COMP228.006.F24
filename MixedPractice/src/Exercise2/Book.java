package Exercise2;

public class Book implements Borrowable{
    private String title;
    private String author;
    private boolean isBorrowed;
    public Book(String title, String author, boolean isBorrowed) {
        this.title = title;
        this.author = author;
        this.isBorrowed = isBorrowed;
    }
    @Override
    public void borrow() {
        if (!isBorrowed) {
            isBorrowed = true;
            System.out.println("Book Borrowed: " + title);
        }
        else {
            System.out.println("Book Already Borrowed: " + title);
        }

    }
    @Override
    public void returnItem(){
        if(isBorrowed){
            isBorrowed = false;
            System.out.println("Book Returned: " + title);
        }
    }
}
