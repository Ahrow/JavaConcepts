package Tasks.Solutions.Task01;

public class Main {
    public static void main(String[] args) {
        Library library = new Library(10); // Instantiate Library with a capacity of 10 books

        // Create several Book objects and add them to the Library
        library.addBook(new Book("Wool", "Hugh Howey", 20.0, 438419));
        library.addBook(new Book("The Road", "Cormac McCarthy", 15.0, 934819));
        library.addBook(new Book("Harry Potter", "JK Rowling", 18.0, 174312));

        // Display all books in the library
        System.out.println("All books in the library:");
        library.displayBooks();

        // Search for a book by title
        System.out.println("\nSearching for 'the':");
        library.searchByTitle("the");
    }
}
