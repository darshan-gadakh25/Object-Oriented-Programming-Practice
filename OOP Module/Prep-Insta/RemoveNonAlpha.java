import java.util.Scanner;

public class RemoveNonAlpha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        StringBuilder result = new StringBuilder();
        
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                result.append(c);
            }
        }
        
        System.out.println("Only alphabets: " + result);
        sc.close();
    }
}