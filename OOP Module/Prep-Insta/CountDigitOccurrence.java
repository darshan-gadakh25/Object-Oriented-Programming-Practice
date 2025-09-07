import java.util.Scanner;

public class CountDigitOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.print("Enter digit to count: ");
        int digit = sc.nextInt();
        
        int count = 0;
        int temp = Math.abs(num);
        
        while (temp > 0) {
            if (temp % 10 == digit) {
                count++;
            }
            temp /= 10;
        }
        
        System.out.println("Digit " + digit + " occurs " + count + " times");
        sc.close();
    }
}