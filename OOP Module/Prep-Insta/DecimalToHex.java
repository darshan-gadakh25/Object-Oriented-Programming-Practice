import java.util.Scanner;

public class DecimalToHex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter decimal number: ");
        int decimal = sc.nextInt();
        
        String hex = Integer.toHexString(decimal).toUpperCase();
        System.out.println("Hexadecimal equivalent: " + hex);
        sc.close();
    }
}