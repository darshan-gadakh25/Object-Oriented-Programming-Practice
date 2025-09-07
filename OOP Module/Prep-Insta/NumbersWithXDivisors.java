import java.util.Scanner;

public class NumbersWithXDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range (start end) and number of divisors: ");
        int start = sc.nextInt();
        int end = sc.nextInt();
        int x = sc.nextInt();
        
        System.out.println("Numbers with exactly " + x + " divisors:");
        for (int i = start; i <= end; i++) {
            if (countDivisors(i) == x) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
    
    static int countDivisors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        return count;
    }
}