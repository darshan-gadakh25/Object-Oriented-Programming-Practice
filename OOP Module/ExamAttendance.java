import java.util.Scanner;
public class ExamAttendance {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total classes held: ");
        int total = sc.nextInt();

        System.out.print("Enter classes attended: ");
        int attended = sc.nextInt();

        double percentage = (attended * 100.0) / total;

        if (percentage >= 75) {
            System.out.println("Student is allowed to sit for the exam.");
        } else {
            System.out.println("Student is not allowed to sit for the exam.");
        }

    }
}

/* 
OUTPUT

java ExamAttendance
Enter total classes held: 100
Enter classes attended: 78
Student is allowed to sit for the exam.


*/