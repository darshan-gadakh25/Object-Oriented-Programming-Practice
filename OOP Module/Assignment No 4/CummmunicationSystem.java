import java.util.Scanner;

public class CummmunicationSystem {
    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.println("Enter Original Text");
        String text1 = sc.nextLine();

        System.out.println("Enter Text to find");
        String text2 = sc.next();

        System.out.println("Enter Replacement Text: ");
        String text3 = sc.next();

        StringBuffer sb= new StringBuffer(text1);
        
        int start= sb.indexOf(text2);

       int end = start + text2.length();

       sb=sb.replace(start, end, text3);
        System.out.println(sb);
    }
}

/*
 * 
 * PS F:\java\OOP Module\Assignment 2\OOP Module\Assignment No 4> javac CummmunicationSystem.java
PS F:\java\OOP Module\Assignment 2\OOP Module\Assignment No 4> java CummmunicationSystem
Enter Original Text
Old Notice
Enter Text to find
Old
Enter Replacement Text: 
New
New Notice
 */