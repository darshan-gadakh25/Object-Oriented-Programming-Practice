import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        StringBuilder result = new StringBuilder();
        
        for (char c : str.toCharArray()) {
            char lower = Character.toLowerCase(c);
            if (lower != 'a' && lower != 'e' && lower != 'i' && lower != 'o' && lower != 'u') {
                result.append(c);
            }
        }
        
        System.out.println("String without vowels: " + result);
        sc.close();
    }
}