import java.util.Scanner;

public class GreatestThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int max = Math.max(Math.max(a, b), c);
        System.out.println("Greatest: " + max);
        sc.close();
    }
}