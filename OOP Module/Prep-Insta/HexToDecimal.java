import java.util.Scanner;

public class HexToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hexadecimal number: ");
        String hex = sc.next();
        
        int decimal = Integer.parseInt(hex, 16);
        System.out.println("Decimal equivalent: " + decimal);
        sc.close();
    }
}