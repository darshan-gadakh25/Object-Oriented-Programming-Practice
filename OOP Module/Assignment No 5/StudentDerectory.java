import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class StudentDerectory {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        ArrayList<String> studentList =new  ArrayList<>();
         while (true) {
            String name=sc.nextLine();
            if(name.equalsIgnoreCase("done")){
                break;
            }
            studentList.add(name);
         }
         System.out.println("Students: "+studentList);

        // TreeSet<String>uniqueStudentList= new TreeSet<>(studentList);
        Collections.sort(studentList);

        System.out.println("Students: "+studentList);
    }
}
