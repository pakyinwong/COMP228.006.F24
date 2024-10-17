public class ScienceBook extends Book{
    private double price;
    public ScienceBook(String title, String description, String publisher, int year){
        super(title, description, publisher, year);
    }

    @Override
    public void setPrice(double price) {
        this.price = price * 0.9;
    }

    @Override
    public String getGenre(){
        return "Science";
    }

    public double getPrice(){
        return this.price;
    }

    @Override
    public String toString() {
        return super.toString() + "\nGenre: " + getGenre() + "\nPrice: " + getPrice();
    }
}
