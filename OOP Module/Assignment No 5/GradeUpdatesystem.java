import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class GradeUpdatesystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Map<String, Integer>student= new LinkedHashMap<>();
        
        System.out.println("Enter the student name and marks: ");
        while (true) {
            String name =sc.next();
            int marks= sc.nextInt();

           if(name.equalsIgnoreCase("Done") && marks == 0) 
            break;

            student.put(name,marks);
        }

        System.out.println("Update student name and marks");
        String name=sc.next();
        int marks= sc.nextInt();

        for(Map.Entry<String, Integer> entry: student.entrySet()){
            if(entry.getKey().equalsIgnoreCase(name)){
                entry.setValue(marks);
            }
        }

        System.out.println("Updated Grade: "+student);
    }
}
