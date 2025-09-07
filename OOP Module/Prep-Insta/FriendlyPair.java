import java.util.Scanner;

public class FriendlyPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        int sum1 = getDivisorSum(num1);
        int sum2 = getDivisorSum(num2);
        
        if ((double) sum1 / num1 == (double) sum2 / num2) {
            System.out.println(num1 + " and " + num2 + " are friendly pair");
        } else {
            System.out.println(num1 + " and " + num2 + " are not friendly pair");
        }
        sc.close();
    }
    
    static int getDivisorSum(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}