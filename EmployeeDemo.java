
class Employee {
    String name;
    double salary;
    int numberOfService;
    
    static int totalEmployees;
    
    Employee(String name, double salary, int numberOfService ){
        this.name=name;
        this.salary=salary;
        this.numberOfService=numberOfService;
        totalEmployees++;
    }
    
    
    void setName(String name){
        this.name=name;
    }
    
    void setSalary(double salary){
        this.salary=salary;
    }
    void setNumberOfService(int numberOfService){
        this.numberOfService=numberOfService;
       
    }
    
    String getName(){
        return name;
    }
    double getSalary(){
        return salary;
    }
    
    int getNumberOfService(){
        return numberOfService;
    }
    
    double calculateBonus(){
        double bonus=0;
        
        if(numberOfService > 5 ){
            return salary * 5 /100;
        }
        else{
            return 0.0;
        }
    }
    static void showTotalEmployees(){
        System.out.println("Total employees: "+totalEmployees);
    }
}

public class EmployeeDemo{

    public static void main(String [] args){
        Employee e1=new Employee("Ravi", 150000,  6);
        Employee e2=new Employee("Anita", 120000, 3 );
        Employee e3=new Employee("Suresh", 100000, 5 );
        System.out.println("Employee Ravi Bonus: "+e1.calculateBonus());
        System.out.println("Employee Anita Bonus:"+e2.calculateBonus());
        System.out.println("Employee Suresh Bonus:"+e3.calculateBonus());
        
        
        Employee.showTotalEmployees();
        
    
    }
}

/*

OUTPUT

PS F:\java\OOP Module\Assignment 2> java EmployeeDemo
Employee Ravi Bonus: 7500.0
Employee Anita Bonus:0.0
Employee Suresh Bonus:0.0
Total employees: 3

*/
