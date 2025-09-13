import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class AttendanceteackingSystem {
    
    public static void main(String[] args) {

        LinkedHashMap<String, Integer> attendance = new LinkedHashMap<>();

        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the student name and attendance: ");
        while (true) {
            String name= sc.next();
            int persentage=sc.nextInt();

            if(name.equalsIgnoreCase("Done") && persentage == 0) 
            break;

            attendance.put(name, persentage);
        }

        System.out.println("Attendances: "+attendance);


        TreeMap<String, Integer> sortedMap=new TreeMap<>(attendance);
        System.out.println("Attendances Report: " +sortedMap);
    }

   
}
