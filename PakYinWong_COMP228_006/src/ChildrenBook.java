public class ChildrenBook extends Book {
    private double price;
    public ChildrenBook(String title, String description, String publisher, int year){
        super(title, description, publisher, year);
    }
    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getGenre(){
        return "Children";
    }

    public double getPrice(){
        return this.price;
    }

    @Override
    public String toString() {
        return super.toString() + "\nGenre: " + getGenre() + "\nPrice: " + getPrice();
    }
}
