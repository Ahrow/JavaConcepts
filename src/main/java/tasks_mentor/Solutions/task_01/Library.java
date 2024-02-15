package tasks_mentor.Solutions.task_01;
public class Library {
    // Attributes
    private Book[] books;
    private int count;

    // Constructor
    public Library(int size) {
        books = new Book[size];
        count = 0;
    }

    // Method to add a book
    public void addBook(Book book) {
        if (count < books.length) {
            books[count++] = book;
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    // Method to display all books
    public void displayBooks() {
        for (int i = 0; i < count; i++) {
            Book book = books[i];System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Price: $" + book.getPrice() + ", ISBN: " + book.getIsbn());
        }
    }

    // Method to search for a book by title
    /**
     * .toLowerCase() is used here to convert both the book's title and the search title to lower case.
     * This ensures that the search is case-insensitive, allowing for matches regardless of the case used in the title or search term.
     *
     * .contains() checks if the book's title, now in lower case, includes the search term (also in lower case).
     * This method allows for partial matches, meaning it will find any book whose title contains the given substring.
     */


    public void searchByTitle(String title) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (books[i].getTitle().toLowerCase().contains(title.toLowerCase())) {
                // If a book title contains the search term, print its details
                Book book = books[i];
                System.out.println("Found: Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Price: $" + book.getPrice() + ", ISBN: " + book.getIsbn());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No book found with the title containing: " + title);
        }
    }
}

