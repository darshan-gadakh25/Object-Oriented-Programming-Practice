class Book {
    private int bookId;
    private String title;
    private String author;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
interface Notifyable {
    void sendNotification(String message);
}


abstract class LibraryMember implements Notifyable {
    protected int memberId;
    protected String name;

    public LibraryMember(int memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }

    public abstract void borrowBook(Book[] books);
}


class StudentMember extends LibraryMember {
    private static final int MAX_BOOKS = 3;
    private int borrowedCount = 0;

    public StudentMember(int memberId, String name) {
        super(memberId, name);
    }

    @Override
    public void borrowBook(Book[] books) {
        int borrowable = Math.min(books.length, MAX_BOOKS - borrowedCount);
        borrowedCount += borrowable;
        System.out.println("StudentMember " + name + " borrowed " + borrowable + " books");
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Notification sent to " + name + ": " + message);
    }
}


class FacultyMember extends LibraryMember {
    private static final int MAX_BOOKS = 5;
    private int borrowedCount = 0;

    public FacultyMember(int memberId, String name) {
        super(memberId, name);
    }

    @Override
    public void borrowBook(Book[] books) {
        int borrowable = Math.min(books.length, MAX_BOOKS - borrowedCount);
        borrowedCount += borrowable;
        System.out.println("FacultyMember " + name + " borrowed " + borrowable + " books");
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Notification sent to " + name + ": " + message);
    }
}
public class LibraryManagementSystem {
    public static void main(String[] args) {
       
        Book book1 = new Book(101, "Java Basics", "Author A");
        Book book2 = new Book(102, "Data Structures", "Author B");
        Book book3 = new Book(103, "Algorithms", "Author C");
        Book book4 = new Book(104, "Database Systems", "Author D");
        Book book5 = new Book(105, "Operating Systems", "Author E");

        StudentMember student = new StudentMember(1, "Amit");
        FacultyMember faculty = new FacultyMember(101, "Prof. Singh");
        Book[] studentBooks = {book1, book2};
        Book[] facultyBooks = {book1, book2, book3, book4};

        student.borrowBook(studentBooks);
        faculty.borrowBook(facultyBooks);
        student.sendNotification("Return books within 7 days");
        faculty.sendNotification("Return books within 14 days");
    }
}