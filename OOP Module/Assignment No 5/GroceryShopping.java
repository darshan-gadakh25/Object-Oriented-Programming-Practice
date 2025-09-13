import java.util.ArrayList;
import java.util.Scanner;

public class GroceryShopping {
    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        ArrayList<String> groceryList = new ArrayList<>();

        System.out.println("Enter items to add (type 'done' to finish):");
        while (true) {
            String item = sc.nextLine();
            if (item.equalsIgnoreCase("done")) break;
            groceryList.add(item);
        }

        System.out.println("Current Grocery List: " + groceryList);

        System.out.println("Enter purchased item:");
        String purchased = sc.nextLine();

        groceryList.remove(purchased);

        System.out.println("Items to buy: " + groceryList);
    }
}
