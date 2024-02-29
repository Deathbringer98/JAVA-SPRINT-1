import java.util.*;

public class LibraryTest {
    public static void main(String[] args) {
        Library library = new Library();

        // Load sample data
        loadData(library);

        // Test functionalities
        testLibraryFeatures(library);
    }

    // Method to load sample data
    private static void loadData(Library library) {
        // Authors
        Author author1 = new Author("Harper Lee", "April 28, 1926");
        Author author2 = new Author("F. Scott Fitzgerald", "September 24, 1896");
        Author author3 = new Author("Toni Morrison", "February 18, 1931");
        Author author4 = new Author("Kazuo Ishiguro", "November 8, 1954");
        Author author5 = new Author("Gabriel Garcia Marquez", "March 6, 1927");
        Author author6 = new Author("Arundhati Roy", "November 24, 1961");
        Author author7 = new Author("Khaled Hosseini", "March 4, 1965");
        Author author8 = new Author("Ian McEwan", "June 21, 1948");
        Author author9 = new Author("Margaret Atwood", "November 18, 1939");
        Author author10 = new Author("Terry Pratchett", "April 28, 1948");

        library.addAuthor(author1);
        library.addAuthor(author2);
        library.addAuthor(author3);
        library.addAuthor(author4);
        library.addAuthor(author5);
        library.addAuthor(author6);
        library.addAuthor(author7);
        library.addAuthor(author8);
        library.addAuthor(author9);
        library.addAuthor(author10);

        // Books
        Book book1 = new Book("To Kill a Mockingbird", author1, "9780061120084", "Harper Perennial Modern Classics", 3);
        Book book2 = new Book("The Great Gatsby", author2, "9780743273565", "Scribner", 2);
        Book book3 = new Book("Beloved", author3, "9781400033416", "Vintage", 4);
        Book book4 = new Book("Never Let Me Go", author4, "9781400078776", "Vintage International", 2);
        Book book5 = new Book("One Hundred Years of Solitude", author5, "9780061120091", "Harper Perennial Modern Classics", 1);
        Book book6 = new Book("The God of Small Things", author6, "9780679457312", "Random House", 2);
        Book book7 = new Book("The Kite Runner", author7, "9781594480003", "Riverhead Books", 3);
        Book book8 = new Book("Atonement", author8, "9780385721790", "Anchor Books", 2);
        Book book9 = new Book("The Handmaid's Tale", author9, "9780385490818", "Anchor Books", 1);
        Book book10 = new Book("Good Omens", author10, "9780060853983", "William Morrow", 3);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);
        library.addBook(book7);
        library.addBook(book8);
        library.addBook(book9);
        library.addBook(book10);

        // Patrons
        Patron patron1 = new Patron("Alice Brown", "123 Main St", "555-1234");
        Patron patron2 = new Patron("Bob Smith", "456 Elm St", "555-5678");
        Patron patron3 = new Patron("Charlie Davis", "789 Oak St", "555-9012");
        Patron patron4 = new Patron("Diana Johnson", "101 Pine St", "555-3456");
        Patron patron5 = new Patron("Emma Wilson", "202 Maple St", "555-7890");
        Patron patron6 = new Patron("Frank Taylor", "303 Cedar St", "555-2345");
        Patron patron7 = new Patron("Grace Lee", "404 Birch St", "555-6789");
        Patron patron8 = new Patron("Henry Martin", "505 Walnut St", "555-0123");
        Patron patron9 = new Patron("Ivy Anderson", "606 Spruce St", "555-4567");
        Patron patron10 = new Patron("Jack Evans", "707 Ash St", "555-8901");

        library.addPatron(patron1);
        library.addPatron(patron2);
        library.addPatron(patron3);
        library.addPatron(patron4);
        library.addPatron(patron5);
        library.addPatron(patron6);
        library.addPatron(patron7);
        library.addPatron(patron8);
        library.addPatron(patron9);
        library.addPatron(patron10);
    }

    // Method to test library features
    private static void testLibraryFeatures(Library library) {
        // Borrow a book
        Patron patron1 = library.getPatrons().get(0);
        Patron patron2 = library.getPatrons().get(1);
        Patron patron3 = library.getPatrons().get(2);
        Patron patron4 = library.getPatrons().get(3);
        Patron patron5 = library.getPatrons().get(4);
        Patron patron6 = library.getPatrons().get(5);
        Patron patron7 = library.getPatrons().get(6);
        Patron patron8 = library.getPatrons().get(7);
        Patron patron9 = library.getPatrons().get(8);
        Patron patron10 = library.getPatrons().get(9);

        System.out.println();
        Book book1 = library.searchBooksByTitle("To Kill a Mockingbird").get(0);
        Book book2 = library.searchBooksByTitle("The Great Gatsby").get(0);
        Book book3 = library.searchBooksByTitle("Beloved").get(0);
        Book book4 = library.searchBooksByTitle("Never Let Me Go").get(0);
        Book book5 = library.searchBooksByTitle("One Hundred Years of Solitude").get(0);
        Book book6 = library.searchBooksByTitle("The God of Small Things").get(0);
        Book book7 = library.searchBooksByTitle("The Kite Runner").get(0);
        Book book8 = library.searchBooksByTitle("Atonement").get(0);
        Book book9 = library.searchBooksByTitle("The Handmaid's Tale").get(0);
        Book book10 = library.searchBooksByTitle("Good Omens").get(0);

        System.out.println("Before Borrowing:");
        System.out.println();
        library.displayBookStatus();

        System.out.println();
        System.out.println(patron1.getName() + " borrowed " + book1.getTitle());
        System.out.println(patron2.getName() + " borrowed " + book2.getTitle());
        System.out.println(patron3.getName() + " borrowed " + book3.getTitle());
        System.out.println(patron4.getName() + " borrowed " + book4.getTitle());
        System.out.println(patron5.getName() + " borrowed " + book5.getTitle());
        System.out.println(patron6.getName() + " borrowed " + book6.getTitle());
        System.out.println(patron7.getName() + " borrowed " + book7.getTitle());
        System.out.println(patron8.getName() + " borrowed " + book8.getTitle());
        System.out.println(patron9.getName() + " borrowed " + book9.getTitle());
        System.out.println(patron10.getName() + " borrowed " + book10.getTitle());
        System.out.println();

        library.borrowBook(patron1, book1, 1);
        library.borrowBook(patron2, book2, 2);
        library.borrowBook(patron3, book3, 1);
        library.borrowBook(patron4, book4, 2);
        library.borrowBook(patron5, book5, 1);
        library.borrowBook(patron6, book6, 2);
        library.borrowBook(patron7, book7, 1);
        library.borrowBook(patron8, book8, 2);
        library.borrowBook(patron9, book9, 1);
        library.borrowBook(patron10, book10, 2);

        System.out.println();
        System.out.println("After borrowing:");
        System.out.println();
        library.displayBookStatus();
        System.out.println();

        // Return a book
        library.returnBook(patron1, book1, 1);
        library.returnBook(patron2, book2, 2);
        library.returnBook(patron3, book3, 1);
        library.returnBook(patron4, book4, 2);
        library.returnBook(patron5, book5, 1);
        library.returnBook(patron6, book6, 2);
        library.returnBook(patron7, book7, 1);
        library.returnBook(patron8, book8, 2);
        library.returnBook(patron9, book9, 1);
        library.returnBook(patron10, book10, 2);

        System.out.println();
        System.out.println("After returning:");
        System.out.println();
        library.displayBookStatus();
        System.out.println();
    }
}
