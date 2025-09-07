import java.util.Scanner;

public class PrimeRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        if (isPrime(num, 2)) {
            System.out.println(num + " is prime");
        } else {
            System.out.println(num + " is not prime");
        }
        sc.close();
    }
    
    static boolean isPrime(int n, int i) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % i == 0) return false;
        if (i * i > n) return true;
        
        return isPrime(n, i + 1);
    }
}