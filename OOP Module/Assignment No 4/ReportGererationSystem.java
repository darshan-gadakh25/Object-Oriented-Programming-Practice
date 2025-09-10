import java.util.Scanner;

public class ReportGererationSystem {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Original title:");
        String text1 = sc.nextLine();

        System.out.println("Enter Department name: ");
        String text2=sc.nextLine();

        StringBuilder sb=new StringBuilder(text1);

        int index = sb.indexOf("Report");

        sb.insert(index,text2+" " );
         System.out.println(sb);
    }   
}

/*
 * PS F:\java\OOP Module\Assignment 2\OOP Module\Assignment No 4> java ReportGererationSystem      
Enter Original title:
Annual Report
Enter Department name: 
CDac
Annual CDac Report
 */
