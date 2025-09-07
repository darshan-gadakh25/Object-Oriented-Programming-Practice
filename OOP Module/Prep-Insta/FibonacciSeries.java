import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        
        System.out.println("Fibonacci series up to " + n + " terms:");
        
        int a = 0, b = 1;
        
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                System.out.print(a + " ");
            } else if (i == 1) {
                System.out.print(b + " ");
            } else {
                int next = a + b;
                System.out.print(next + " ");
                a = b;
                b = next;
            }
        }
        sc.close();
    }
}