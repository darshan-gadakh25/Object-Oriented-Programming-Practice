import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public abstract class StudentGradeManagement {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        Map<String,Integer> studentDetails=new HashMap<>();

        while (true) {
            String name=sc.next();
            int marks =sc.nextInt();

            if( name.equalsIgnoreCase("done") && marks == 0){
                break;
            }

            studentDetails.put(name, marks);
        }

        System.out.println("Grade Report: "+studentDetails);
    }
}
