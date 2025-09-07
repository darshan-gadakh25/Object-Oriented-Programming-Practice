import java.util.Scanner;

public class StringPermutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        
        System.out.println("Permutations:");
        generatePermutations(str, "");
        sc.close();
    }
    
    static void generatePermutations(String str, String prefix) {
        if (str.length() == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < str.length(); i++) {
                String remaining = str.substring(0, i) + str.substring(i + 1);
                generatePermutations(remaining, prefix + str.charAt(i));
            }
        }
    }
}