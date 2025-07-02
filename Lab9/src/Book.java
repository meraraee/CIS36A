import java.time.LocalDate;

public class Book {

    //instance variables
    private String title;
    private String author;
    private boolean isCheckedOut;
    private String borrower;
    private LocalDate dueDate;    //indicating that this instance variable holds a reference(memory address) to an object of that class(LocalDate)

    //constructors
    public Book(String title, String author){
        this.title = title;
        this.author = author;

        //throwing an IllegalArgumentException
        if(title == null || title.isEmpty() || author == null || author.isEmpty()){
            throw new IllegalArgumentException("Title or Author can't be null or empty.");
        }
    }

    //instance methods

    //getters
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public boolean getIsCheckedOut(){
        return isCheckedOut;
    }
    public String getBorrower(){
        return borrower;
    }
    public LocalDate getDueDate(){
        return dueDate;
    }

    //setter
    public void setDueDate(LocalDate dueDate){
        this.dueDate = dueDate;
    }

    public boolean checkOut(String studentName){

        //throwing an IllegalArgumentException
        if(studentName == null || studentName.isEmpty()){
            throw new IllegalArgumentException("Student Name can't be null or empty.");

        }

        //throwing an IllegalStateException (if book is already checked out)
        if(isCheckedOut){
            throw new IllegalStateException("This book is already checked out.");
        }

        isCheckedOut = true;
        borrower = studentName;
        dueDate = LocalDate.now().plusDays(14);    //Due Date Algorithm applied here
        //LocalDate.now() - gets today's date
        //.plusDays(14) - adds 14 days to that date

        return true;
    }

    public void turnIn(){

        //throwing an IllegalStateException if book is NOT checked out
        if(!isCheckedOut){
            throw new IllegalStateException("book is not checked out.");
        }

        isCheckedOut = false;
        borrower = null;
        dueDate = null;

    }
    public String toString(){
        //converts boolean value to "Yes" or "No"
        String checkedOutStatus = isCheckedOut ? "Yes" : "No";

        return title + ", " + author + ", " + ". " + "Checked out: " + checkedOutStatus;
    }

}
