import java.util.*;

public class Library {
    private List<Book> books;
    private List<Author> authors;
    private List<Patron> patrons;

    public Library() {
        this.books = new ArrayList<>();
        this.authors = new ArrayList<>();
        this.patrons = new ArrayList<>();
    }

    // Methods for book management
    public void addBook(Book book) {
        books.add(book);
    }

    public Book removeBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                books.remove(book);
                return book;
            }
        }
        return null;
    }

    // Methods for author management
    public void addAuthor(Author author) {
        authors.add(author);
    }

    public Author removeAuthor(String name) {
        for (Author author : authors) {
            if (author.getName().equals(name)) {
                authors.remove(author);
                return author;
            }
        }
        return null;
    }

    // Methods for patron management
    public void addPatron(Patron patron) {
        patrons.add(patron);
    }

    public Patron removePatron(String name) {
        for (Patron patron : patrons) {
            if (patron.getName().equals(name)) {
                patrons.remove(patron);
                return patron;
            }
        }
        return null;
    }

    // Book borrowing and returning
    public void borrowBook(Patron patron, Book book, int numOfCopies) {
        book.borrow(patron, numOfCopies);
        patron.getBorrowedBooks().add(book);
    }

    public void returnBook(Patron patron, Book book, int numOfCopies) {
        book.returnBook(patron, numOfCopies);
        patron.getBorrowedBooks().remove(book);
    }

    // Search methods
    public List<Book> searchBooksByTitle(String title) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                result.add(book);
            }
        }
        return result;
    }

    public List<Book> searchBooksByAuthor(String authorName) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().getName().equalsIgnoreCase(authorName)) {
                result.add(book);
            }
        }
        return result;
    }

    public Book searchBooksByISBN(String ISBN) {
        for (Book book : books) {
            if (book.getISBN().equals(ISBN)) {
                return book;
            }
        }
        return null;
    }

    // Getter method for retrieving the list of patrons
    public List<Patron> getPatrons() {
        return patrons;
    }

    public void displayBookStatus() {
        System.out.println("Book Status:");
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle());
            System.out.println("Status: " + book.getStatus());
            if (book.getStatus() == Status.CHECKED_OUT) {
                System.out.println("Borrowed by: " + getBorrowerName(book));
            } else {
                System.out.println("Available Copies: " + book.getNumOfCopies());
            }
            System.out.println();
        }
    }

    // Method to get the name of the borrower of a book
    private String getBorrowerName(Book book) {
        for (Patron patron : patrons) {
            if (patron.getBorrowedBooks().contains(book)) {
                return patron.getName();
            }
        }
        return "Unknown";
    }
}
