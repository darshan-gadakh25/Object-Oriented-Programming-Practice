import java.util.Scanner;

public class AddFractions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first fraction (num den): ");
        int num1 = sc.nextInt();
        int den1 = sc.nextInt();
        
        System.out.print("Enter second fraction (num den): ");
        int num2 = sc.nextInt();
        int den2 = sc.nextInt();
        
        int resultNum = num1 * den2 + num2 * den1;
        int resultDen = den1 * den2;
        
        int gcd = findGCD(resultNum, resultDen);
        resultNum /= gcd;
        resultDen /= gcd;
        
        System.out.println("Sum: " + resultNum + "/" + resultDen);
        sc.close();
    }
    
    static int findGCD(int a, int b) {
        if (b == 0) return a;
        return findGCD(b, a % b);
    }
}