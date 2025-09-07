import java.util.Scanner;

public class NumberToWords {
    static String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    static String[] teens = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    static String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (0-999): ");
        int num = sc.nextInt();
        
        if (num == 0) {
            System.out.println("zero");
        } else {
            System.out.println(convertToWords(num));
        }
        sc.close();
    }
    
    static String convertToWords(int num) {
        if (num >= 100) {
            return ones[num / 100] + " hundred " + convertToWords(num % 100);
        } else if (num >= 20) {
            return tens[num / 10] + " " + ones[num % 10];
        } else if (num >= 10) {
            return teens[num - 10];
        } else {
            return ones[num];
        }
    }
}