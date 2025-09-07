import java.util.Scanner;

public class SumNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many numbers: ");
        int n = sc.nextInt();
        
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            sum += sc.nextInt();
        }
        
        System.out.println("Sum: " + sum);
        sc.close();
    }
}