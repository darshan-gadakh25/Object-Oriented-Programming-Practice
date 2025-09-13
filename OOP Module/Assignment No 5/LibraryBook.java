import java.util.HashMap;
import java.util.Map;

class Book {
    String title;
    int copies;

    Book(String title,int copies){
        this.title=title;
        this.copies=copies;
    }

    @Override
    public String toString() {
        return "[ copies=" + copies + "]";
    }

    public void borrowBook(int count) {
        if (copies >= count) {
            copies -= count;
        } else {
            System.out.println("Not enough copies of available.");
        }
    }
}
public class LibraryBook {
    public static void main(String[] args) {
        Map<String, Book> inventory= new HashMap<>();

        inventory.put("Java", new Book("Java", 3));
        inventory.put("Python", new Book("Python", 5));

        inventory.get("Java").borrowBook(1);

        System.out.println("Current Inventory");
        System.out.println(inventory);
        
    }
}
