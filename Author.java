import java.util.ArrayList;
import java.util.List;

public class Author {
    // Properties of an author
    private String name;
    private String dateOfBirth;
    private List<Book> booksWritten;

    // Constructor to initialize an author object
    public Author(String name, String dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.booksWritten = new ArrayList<>();
    }

    // Method to add a book written by the author
    public void addBook(Book book) {
        booksWritten.add(book);
    }

    // Method to remove a book written by the author
    public boolean removeBook(Book book) {
        return booksWritten.remove(book);
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public List<Book> getBooksWritten() {
        return booksWritten;
    }


    // toString method to provide a string representation of the Author object
    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", booksWritten=" + booksWritten +
                '}';
    }
}
