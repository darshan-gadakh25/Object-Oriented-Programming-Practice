import java.util.Scanner;
public class ExamResult { 
  

  public static void main(String[] args) { 

    Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();


        if (marks >= 35) {
            System.out.println("Student has passed");
        } 
else {
            System.out.println("Student has failed");
        }
    }
}

/*

OUtPUT:--
   java ExamResult
Enter marks: 42
Student has passed
*/
