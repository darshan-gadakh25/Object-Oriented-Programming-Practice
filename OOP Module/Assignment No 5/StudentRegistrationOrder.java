
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentRegistrationOrder {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        LinkedHashMap <String, Integer> studentdetails = new LinkedHashMap<>();

        System.out.println("Enter the student name and roll no: ");
        while (true) {
            String name =sc.next();
            int rollNo= sc.nextInt();

           if(name.equalsIgnoreCase("Done") && rollNo == 0) 
            break;

            studentdetails.put(name,rollNo);
        }

        System.out.println("Registration Order: ");
        for(Map.Entry<String,Integer> entry : studentdetails.entrySet()){
            System.out.print(entry.getKey()+":"+entry.getValue()+",");
        }


    }
}
