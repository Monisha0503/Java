class Book {
    String title;
    String author;
    boolean isAvailable;   // true = available, false = not available
    static int totalBooks = 0;   // total books currently available in library

    // Constructor
    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;   // new book is available by default
        totalBooks++;              // increase total available books
    }

    // Checkout a book (issue)
    void checkout() {
        if (isAvailable) {
            isAvailable = false;   // now book is not available
            totalBooks--;          // decrease available count
            System.out.println(title + " has been checked out.");
        } else {
            System.out.println(title + " is already checked out!");
        }
    }

    // Return a book
    void returnBook() {
        if (!isAvailable) {
            isAvailable = true;    // now book is back
            totalBooks++;          // increase available count
            System.out.println(title + " has been returned.");
        } else {
            System.out.println(title + " was not checked out.");
        }
    }

    // Display book details
    void display() {
        System.out.println("Title: " + title + ", Author: " + author +
                ", Available: " + (isAvailable ? "Yes" : "No"));
    }

    // Show total available books
    static void showTotalBooks() {
        System.out.println("Total books available: " + totalBooks);
    }
}

public class BookProgram {
    public static void main(String[] args) {
        Book b1 = new Book("The Alchemist", "Paulo Coelho");
        Book b2 = new Book("Wings of Fire", "A.P.J. Abdul Kalam");

        b1.display();
        b2.display();
        Book.showTotalBooks();

        b1.checkout();
        Book.showTotalBooks();

        b2.checkout();
        Book.showTotalBooks();

        b1.returnBook();
        Book.showTotalBooks();
    }
}