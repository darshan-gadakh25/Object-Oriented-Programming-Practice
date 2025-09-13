import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class EmployeeSalary {
    public static void main(String[] args) {
        List<Employee> empList=new ArrayList<>();
        empList.add(new Employee("Darshan", 10000));
        empList.add(new Employee("Kunal", 20000));
        empList.add(new Employee("Krishan", 30000));
        empList.add(new Employee("Gaurav", 25000));
        Collections.sort(empList);
        
        System.out.print("Sorted by salary: ");
        for(Employee e: empList){
            System.out.print(e.name+":"+e.salary+",");
        }
    }

   
}
