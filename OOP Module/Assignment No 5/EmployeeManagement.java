import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Employee implements Comparable<Employee> {

    String name;
    double salary;

    Employee(String name, double salary){
        this.name=name;
        this.salary=salary;
    }

//    @Override
//    public String toString(){
//     return "Employee List [ name : "+name+", salary :"+salary+"]";
//    }

   @Override
   public int compareTo(Employee o) {
     return (int) (this.salary - o.salary);
   }

}
public class EmployeeManagement {
    
    public static void main(String[] args) {
        List<Employee> empList=new ArrayList<>();
        empList.add(new Employee("Darshan", 10000));
        empList.add(new Employee("Kunal", 20000));
        empList.add(new Employee("Krishan", 30000));
        empList.add(new Employee("Gaurav", 25000));

        System.out.println("Employee List:");
        for(Employee e : empList){
            System.out.print(e.name+": "+e.salary +",");
        }
    }
}
