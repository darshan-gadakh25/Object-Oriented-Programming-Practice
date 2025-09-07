import java.util.Scanner;

public class SumRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start: ");
        int start = sc.nextInt();
        System.out.print("Enter end: ");
        int end = sc.nextInt();
        
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        
        System.out.println("Sum from " + start + " to " + end + ": " + sum);
        sc.close();
    }
}