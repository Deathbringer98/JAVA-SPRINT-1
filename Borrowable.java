/**
 * An interface representing items that can be borrowed and returned.
 */
public interface Borrowable {
    /**
     * Allows a patron to borrow a specified number of copies of this item.
     *
     * @param patron     the patron borrowing the item
     * @param numOfCopies the number of copies to borrow
     */
    void borrow(Patron patron, int numOfCopies);

    /**
     * Allows a patron to return a specified number of copies of this item.
     *
     * @param patron     the patron returning the item
     * @param numOfCopies the number of copies to return
     */
    void returnBook(Patron patron, int numOfCopies);

    /**
     * Gets the title of the borrowable item.
     *
     * @return the title of the item
     */
    String getTitle();

    /**
     * Gets the current status of the borrowable item.
     *
     * @return the status of the item
     */
    Status getStatus();

    /**
     * Sets the status of the borrowable item.
     *
     * @param status the status to set
     */
    void setStatus(Status status);

    /**
     * Gets the number of available copies of the borrowable item.
     *
     * @return the number of available copies
     */
    int getNumOfCopies();

    /**
     * Sets the number of available copies of the borrowable item.
     *
     * @param numOfCopies the number of available copies to set
     */
    void setNumOfCopies(int numOfCopies);
}

/**
 * 
 *        \     /      
 *         \___/        
 *       /        \      
 *      |   O  O   |    
 *       \   ⌒   /      
 *         \___/        
 *  😊
 * 
 */
