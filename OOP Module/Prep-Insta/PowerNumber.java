import java.util.Scanner;

public class PowerNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base and exponent: ");
        int base = sc.nextInt();
        int exp = sc.nextInt();
        
        double result = Math.pow(base, exp);
        System.out.println(base + "^" + exp + " = " + result);
        sc.close();
    }
}