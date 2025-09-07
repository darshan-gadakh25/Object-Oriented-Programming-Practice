import java.util.Scanner;

public class StringLengthRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        int length = getLength(str);
        System.out.println("Length: " + length);
        sc.close();
    }
    
    static int getLength(String str) {
        if (str.equals("")) return 0;
        return 1 + getLength(str.substring(1));
    }
}