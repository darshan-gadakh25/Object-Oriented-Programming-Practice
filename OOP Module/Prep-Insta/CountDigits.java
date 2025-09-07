import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int count = String.valueOf(Math.abs(num)).length();
        System.out.println("Number of digits: " + count);
        sc.close();
    }
}