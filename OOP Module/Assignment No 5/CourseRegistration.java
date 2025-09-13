import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CourseRegistration {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Set<String> courseList=new HashSet<>();

        System.out.println("Enter Course codes: ");
        while (true) {
            String course=sc.nextLine();
            if( course.equalsIgnoreCase("done")) 
            break;
            courseList.add(course);
        }

        System.out.println("Registred codes: "+courseList);
    }
}
