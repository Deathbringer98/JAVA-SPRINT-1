import java.util.ArrayList;
import java.util.List;

public class Patron {
    // Properties of a patron
    private String name;
    private String address;
    private String phoneNumber;
    private List<Book> borrowedBooks;

    // Constructor to initialize a patron object
    public Patron(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.borrowedBooks = new ArrayList<>();
    }

    // Method to borrow a book
    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    // Method to return a book
    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    // Setter methods (not used in this code snippet)

    // toString method to provide a string representation of the Patron object
    @Override
    public String toString() {
        return "Patron{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", borrowedBooks=" + borrowedBooks +
                '}';
    }
}
