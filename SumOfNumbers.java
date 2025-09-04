import java.util.Scanner;

public class SumOfNumbers {
    
    static void calculateSum(int N) {
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }
        System.out.println("The sum of numbers from 1 to " + N + " is: " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int N = sc.nextInt();

        calculateSum(N);

    }
}