import java.util.Scanner;

public class NotifivationSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Original Text");
        String text1 = sc.nextLine();

        System.out.println("Enter Text to find");
        String text2 = sc.next();

        System.out.println("Enter Replacement Text: ");
        String text3 = sc.next();

        // String sb=new String(text1);

        StringBuilder sb= new StringBuilder(text1);
        
        // if (sb.contains(text2)){
        //     sb= sb.replace(text2, text3);
        // }
        int start= sb.indexOf(text2);

       int end = start + text2.length();

       sb=sb.replace(start, end, text3);
        System.out.println(sb);
    }
}
/*
 * S F:\java\OOP Module\Assignment 2\OOP Module\Assignment No 4> java NotifivationSystem
Enter Original Text
hello My name is Darshan
Enter Text to find
My
Enter Replacement Text: 
mera
hello mera name is Darshan
 */
