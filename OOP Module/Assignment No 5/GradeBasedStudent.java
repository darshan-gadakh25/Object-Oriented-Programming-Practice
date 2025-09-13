import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;


public class GradeBasedStudent {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Map<String , Integer> studentData= new HashMap<>();

        
        System.out.println("Enter the student name and marks: ");
        while (true) {
            String name =sc.next();
            int marks= sc.nextInt();

           if(name.equalsIgnoreCase("Done") && marks == 0) 
            break;

            studentData.put(name,marks);
        }
        System.out.println("Enter Threshould value: ");
        int cutOff=sc.nextInt();

            // studentData.entrySet().removeIf(entry -> entry.getValue() < cutOff);
        Iterator<Map.Entry<String, Integer>> iterator = studentData.entrySet().iterator();
            while (iterator.hasNext()) {
             Map.Entry<String, Integer> entry = iterator.next();
             if (entry.getValue() < cutOff) {
                iterator.remove();
             }
        }
        System.out.println("Honor Roll: "+studentData);

    }
}
