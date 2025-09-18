import java.util.*;

class Employee{
	private String name;
	private double salary;
	
	Employee(String name, double salary){
		this.name=name;
		this.salary=salary;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public double getSalary(){
		return salary;
	}
	
	public void setSalary(double salary){
		this.salary=salary;
	}
	
}
public class EmployeeManagementSystem  {
	public static void main(String [] args){
	
		List<Employee> empList=new ArrayList<>();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee name and salary");
		for (int i=1;i<=7 ;i++ ){
			
			String name=sc.next();
			int salary=sc.nextInt();
			
			empList.add(new Employee(name,salary));
		}
		
		System.out.println("Employee List");
	
		for(Employee e: empList){
			System.out.println(e.getName()+":"+e.getSalary());
		}
		
	}
}