public enum Status {
    // Define the statuses for a library item
    AVAILABLE("Available"),
    CHECKED_OUT("Checked Out"),
    OVERDUE("Overdue");

    // Define a private field to hold the status description
    private final String description;

    // Constructor to initialize the status with a description
    Status(String description) {
        this.description = description;
    }

    // Method to get the description of the status
    public String getDescription() {
        return description;
    }
}
