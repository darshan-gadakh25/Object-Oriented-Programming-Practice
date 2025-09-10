import java.util.Scanner;

public class RemovingString {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Original text:");
        String text1 = sc.nextLine();

        System.out.println("Enter the text that remoing in given text:");
        String text2=sc.nextLine();

        StringBuilder sb=new StringBuilder(text1);

        int start = sb.indexOf(text2);

        int end = start +text2.length();

       sb= sb.delete(start, end);
        System.out.println(sb);

    }
}

/*
 * PS F:\java\OOP Module\Assignment 2\OOP Module\Assignment No 4> java RemovingString
Enter Original text:
Please read - Do not disturb
Enter the text that remoing in given text:
- Do not disturb
Please read 
 */