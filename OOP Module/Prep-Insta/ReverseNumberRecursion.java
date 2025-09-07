import java.util.Scanner;

public class ReverseNumberRecursion {
    static int reversed = 0;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        reverseNumber(num);
        System.out.println("Reversed number: " + reversed);
        sc.close();
    }
    
    static void reverseNumber(int num) {
        if (num == 0) return;
        
        reversed = reversed * 10 + num % 10;
        reverseNumber(num / 10);
    }
}