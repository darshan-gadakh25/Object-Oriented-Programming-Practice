import java.util.Scanner;

public class BinaryToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary number: ");
        String binary = sc.next();
        
        int decimal = Integer.parseInt(binary, 2);
        String octal = Integer.toOctalString(decimal);
        
        System.out.println("Octal equivalent: " + octal);
        sc.close();
    }
}