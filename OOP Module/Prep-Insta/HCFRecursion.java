import java.util.Scanner;

public class HCFRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int hcf = findHCF(a, b);
        System.out.println("HCF: " + hcf);
        sc.close();
    }
    
    static int findHCF(int a, int b) {
        if (b == 0) return a;
        return findHCF(b, a % b);
    }
}