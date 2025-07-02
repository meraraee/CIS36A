import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;


public class Library {
    private Book[] books;
    private int bookCount;
    private int MAX_BOOKS = 1000;

    //constructors:
    public Library(){

        //initializing books to a new array of type Book with length "MAX_BOOKS"
        books = new Book[MAX_BOOKS];
        bookCount = 0;
    }


    //instance methods:
    public int getBookCount(){
        return bookCount;
    }

    public int getMAX_BOOKS(){
        return MAX_BOOKS;
    }

    public void addBook(Book b){

        //if library is full, it throws an ILLEGAL STATE EXCEPTION
        if(bookCount > MAX_BOOKS){
            throw new IllegalStateException("Library is full.");
        }

        //if a book with the same title & author is already in the library, throws an ILLEGAL STATE EXCEPTION
        for(int i = 0; i < bookCount; i++){
            if(books[i].getTitle().equals(b.getTitle()) && books[i].getAuthor().equals(b.getAuthor())){
                throw new IllegalStateException("There is a book with the same Title and Author that already exist.");
            }
        }
        //adding b to library
        books[bookCount++] = b;
    }

    public void addBook(String title, String author){

        //if library is full, throw an Illegal State Exception
        if(bookCount >= MAX_BOOKS){
            throw new IllegalStateException("Library is full.");
        }

        //If a book with the same title and author already exists, it throws an IllegalStateException
        for(int i = 0; i < bookCount; i++){
            if(books[i].getTitle().equals(title) && books[i].getAuthor().equals(author)){
                throw new IllegalStateException("There is a book with the same Title and Author that already exist.");
            }
        }
        //creating a new Book with the given title and author & adds to library
        books[bookCount++] = new Book(title, author);
    }

    public Book findBook(String title){
        //This method searches a book by its title. IF found, it returns the book, else it throws an Illegal Argument Exception
        for(int i = 0; i < bookCount; i++){
            if(books[i].getTitle().equals(title)){
                return books[i];
            }
        }
        throw new IllegalArgumentException("Book does not exist.");
    }

    public boolean checkOutBook(String title, String studentName){

        //attempt to finding book with its title
        //IF the book is not found, findBook will throw an Illegal Argument Exception
        Book book = findBook(title);

        //if book is already checked out -> throws Illegal State Exception
        if(book.getIsCheckedOut()){
            throw new IllegalStateException("The book is already checked out.");
        }

        //checking out book with studentName
        book.checkOut(studentName);
        return true;
    }

    public boolean returnBook(String title) {

        //finding book by its title
        //if book not found(doesn't exist), title will already throw an illegal Argument Exception
        Book book = findBook(title);

        //if the book exists and is not currently checked out, throws an illegal State Exception
        if (!book.getIsCheckedOut()) {
            throw new IllegalStateException("Book is not currently checked out.");
        }

        //else we return the book, and return true

        //calling the Book's turnIn method to return it
        book.turnIn();
        return true;
    }

    public Book[] getBooks(){
        //creating a new Book array with exactly 'bookCount' elements
        //ensuring we only have books that have already been added to library
        Book[] validBooks = new Book[bookCount];

        //copying the actual Book objects from the original 'books' array into our new array. Starting at index 0 and copy 'bookCount' elements.
        System.arraycopy(books, 0, validBooks, 0, bookCount);

        //returning a "trimmed" array, with only the actual added books (no null)
        return validBooks;
        //which now holds only the valid Book instances in the same order they were added to the library.
    }


    // Method to find all overdue books
    public Book[] findOverdueBooks() {
        List<Book> overdueBooks = new ArrayList<>();
        for (int i = 0; i < bookCount; i++) {
            Book book = books[i];
            if (book.getIsCheckedOut() && book.getDueDate() != null && book.getDueDate().isBefore(LocalDate.now())) {
                overdueBooks.add(book);
            }
        }
        return overdueBooks.toArray(new Book[0]);
    }

    // Method to check if a specific student has any overdue books
    public boolean checkStudentOverdue(String studentName) {
        for (int i = 0; i < bookCount; i++) {
            Book book = books[i];
            if (book.getBorrower() != null && book.getBorrower().equals(studentName)) {
                if (book.getIsCheckedOut() && book.getDueDate() != null && book.getDueDate().isBefore(LocalDate.now())) {
                    return true;  // If any book is overdue for the student
                }
            }
        }
        return false;  // No overdue books found for the student
    }

    // Method to get all overdue books for a specific student
    public Book[] studentBooksOverdue(String studentName) {
        List<Book> overdueBooks = new ArrayList<>();
        for (int i = 0; i < bookCount; i++) {
            Book book = books[i];
            if (book.getBorrower() != null && book.getBorrower().equals(studentName)) {
                if (book.getIsCheckedOut() && book.getDueDate() != null && book.getDueDate().isBefore(LocalDate.now())) {
                    overdueBooks.add(book);
                }
            }
        }
        return overdueBooks.toArray(new Book[0]);
    }

}
