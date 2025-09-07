import java.util.Scanner;

public class ReplaceZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        String numStr = String.valueOf(num);
        String result = numStr.replace('0', '1');
        
        System.out.println("After replacing 0s with 1s: " + result);
        sc.close();
    }
}