import java.util.Scanner;

public class Permutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n (people) and r (seats): ");
        int n = sc.nextInt();
        int r = sc.nextInt();
        
        long permutation = factorial(n) / factorial(n - r);
        System.out.println("P(" + n + "," + r + ") = " + permutation);
        sc.close();
    }
    
    static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}