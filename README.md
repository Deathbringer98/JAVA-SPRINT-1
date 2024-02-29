# Library Management System

# Overview
The Library Management System is a Java application designed to manage a library's catalog, patrons, and borrowing/returning of books. It provides functionalities to add books, authors, and patrons to the library database, as well as borrow and return books by patrons.

# Features
1. Add Data
Books: Add new books to the library catalog with details such as title, author, ISBN, publisher, and number of copies.
Authors: Add information about authors, including their name and birth date.
Patrons: Register patrons by providing their name, address, and contact number.
2. Borrow Books
Patrons can borrow books from the library by selecting from available titles.
The system tracks the number of copies borrowed by each patron and updates the available copies accordingly.
3. Return Books
Patrons can return books they've borrowed, allowing other patrons to borrow them.
The system updates the number of copies returned and makes them available for borrowing again.
4. Display Book Status
Provides a summary of available books, borrowed books, and the number of copies available for each title.
Helps librarians keep track of book availability and manage their inventory effectively.
Usage
Compile: Compile the Java files using the javac command.


# javac LibraryTest.java
Run: Execute the compiled Java program using the java command.


# java LibraryTest
Interact: Follow the prompts to perform various actions such as adding books, borrowing, and returning books.

Sample Output
vbnet
Before Borrowing:

Book Title                              | Available Copies | Borrowed Copies
----------------------------------------------------------------------------
To Kill a Mockingbird                   | 3                | 0
The Great Gatsby                        | 2                | 0
Beloved                                 | 4                | 0
Never Let Me Go                         | 2                | 0
One Hundred Years of Solitude           | 1                | 0
The God of Small Things                 | 2                | 0
The Kite Runner                         | 3                | 0
Atonement                               | 2                | 0
The Handmaid's Tale                     | 1                | 0
Good Omens                              | 3                | 0

Alice Brown borrowed To Kill a Mockingbird
Bob Smith borrowed The Great Gatsby
Charlie Davis borrowed Beloved
Diana Johnson borrowed Never Let Me Go
Emma Wilson borrowed One Hundred Years of Solitude
Frank Taylor borrowed The God of Small Things
Grace Lee borrowed The Kite Runner
Henry Martin borrowed Atonement
Ivy Anderson borrowed The Handmaid's Tale
Jack Evans borrowed Good Omens

After borrowing:

Book Title                              | Available Copies | Borrowed Copies
----------------------------------------------------------------------------
To Kill a Mockingbird                   | 2                | 1
The Great Gatsby                        | 0                | 2
Beloved                                 | 3                | 1
Never Let Me Go                         | 0                | 2
One Hundred Years of Solitude           | 0                | 1
The God of Small Things                 | 0                | 2
The Kite Runner                         | 2                | 1
Atonement                               | 0                | 2
The Handmaid's Tale                     | 0                | 1
Good Omens                              | 1                | 2

After returning:

Book Title                              | Available Copies | Borrowed Copies
----------------------------------------------------------------------------
To Kill a Mockingbird                   | 3                | 0
The Great Gatsby                        | 2                | 0
Beloved                                 | 4                | 0
Never Let Me Go                         | 2                | 0
One Hundred Years of Solitude           | 1                | 0
The God of Small Things                 | 2                | 0
The Kite Runner                         | 3                | 0
Atonement                               | 2                | 0
The Handmaid's Tale                     | 1                | 0
Good Omens                              | 3                | 0

## Dependencies

- Java Development Kit (JDK) version 8 or higher.

## Contributors

- [Matthew Menchinton]

---

© 2024. All rights reserved.