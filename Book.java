public class Book implements Borrowable {
    // Properties of a book
    private String title;
    private Author author;
    private String ISBN;
    private String publisher;
    private int numOfCopies;
    private Status status;

    // Constructor to initialize a book object
    public Book(String title, Author author, String ISBN, String publisher, int numOfCopies) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.publisher = publisher;
        this.numOfCopies = numOfCopies;
        this.status = Status.AVAILABLE;
    }

    // Method to borrow copies of the book
    @Override
    public void borrow(Patron patron, int numOfCopies) {
        // Check if enough copies are available for borrowing
        if (this.numOfCopies >= numOfCopies) {
            // Reduce the number of available copies and set status to checked out
            this.numOfCopies -= numOfCopies;
            this.status = Status.CHECKED_OUT;
            // Print success message
            System.out.println(numOfCopies + " Copy / Copies of \"" + title + "\" borrowed successfully.");
        } else {
            // Print error message if not enough copies are available
            System.out.println("Sorry, " + title + " is currently not available for borrowing.");
        }
    }

    // Method to return copies of the book
    @Override
    public void returnBook(Patron patron, int numOfCopies) {
        // Increase the number of available copies and set status to available
        this.numOfCopies += numOfCopies;
        this.status = Status.AVAILABLE;
        // Print success message
        System.out.println(numOfCopies + " Copy / Copies of \"" + title + "\" returned successfully.");
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getNumOfCopies() {
        return numOfCopies;
    }

    public Status getStatus() {
        return status;
    }

    // Setter methods
    public void setStatus(Status status) {
        this.status = status;
    }

    public void setNumOfCopies(int numOfCopies) {
        this.numOfCopies = numOfCopies;
    }

    // toString method to provide a string representation of the Book object
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author=" + author +
                ", ISBN='" + ISBN + '\'' +
                ", publisher='" + publisher + '\'' +
                ", numOfCopies=" + numOfCopies +
                ", status=" + status +
                '}';
    }
}
