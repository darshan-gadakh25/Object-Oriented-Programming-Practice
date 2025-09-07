import java.util.Scanner;

public class LCMRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int lcm = (a * b) / findHCF(a, b);
        System.out.println("LCM: " + lcm);
        sc.close();
    }
    
    static int findHCF(int a, int b) {
        if (b == 0) return a;
        return findHCF(b, a % b);
    }
}