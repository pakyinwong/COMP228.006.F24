import javax.swing.*;

public class Driver {
    public static void main(String[] args) {
        String bookType;
        while (true) {
            bookType = JOptionPane.showInputDialog("Enter the type of book (Science/Children):");
            if (bookType.equalsIgnoreCase("Science") || bookType.equalsIgnoreCase("Children")) {
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Invalid input. Please input 'Science' or 'Children'.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        if (bookType.equalsIgnoreCase("Science")) {
            String title = JOptionPane.showInputDialog("Input the title of the science book:");
            String description = JOptionPane.showInputDialog("Input the description of the science book:");
            String publisher = JOptionPane.showInputDialog("Input the publisher of the science book:");
            int year = Integer.parseInt(JOptionPane.showInputDialog("Input the year of the science book:"));
            double price = Double.parseDouble(JOptionPane.showInputDialog("Input the price of the science book:"));
            ScienceBook scienceBook = new ScienceBook(title, description, publisher, year);
            scienceBook.setPrice(price);
            JOptionPane.showMessageDialog(null, scienceBook.toString(), "Book Information", JOptionPane.INFORMATION_MESSAGE);
        } else if (bookType.equalsIgnoreCase("Children")) {
            String title = JOptionPane.showInputDialog("Input the title of the children book:");
            String description = JOptionPane.showInputDialog("Input the description of the children book:");
            String publisher = JOptionPane.showInputDialog("Input the publisher of the children book:");
            int year = Integer.parseInt(JOptionPane.showInputDialog("Input the year of the children book:"));
            double price = Double.parseDouble(JOptionPane.showInputDialog("Input the price of the children book:"));
            ChildrenBook childrenBook = new ChildrenBook(title, description, publisher, year);
            childrenBook.setPrice(price);
            JOptionPane.showMessageDialog(null,  childrenBook.toString(), "Book Information", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
