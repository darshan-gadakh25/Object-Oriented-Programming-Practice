import java.util.Scanner;
public class LeapYearChec { 
  

  public static void main(String[] args) { 

    Scanner sc = new Scanner(System.in);

         System.out.print("Enter year: ");
        int year = sc.nextInt();

        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}

/*

OUtPUT:--
  java LeapYearCheck
Enter year: 2024
2024 is a leap year
*/
