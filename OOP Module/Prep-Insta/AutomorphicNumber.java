import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int square = num * num;
        String numStr = String.valueOf(num);
        String squareStr = String.valueOf(square);
        
        if (squareStr.endsWith(numStr)) {
            System.out.println(num + " is an automorphic number");
        } else {
            System.out.println(num + " is not an automorphic number");
        }
        sc.close();
    }
}