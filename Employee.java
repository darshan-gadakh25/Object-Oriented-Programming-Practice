
public class Employee {

    int id;
    String name;
    double basicSalary;
    
    static int counter=1001;
	
    Employee(){
        this.id=counter;
        this.name="nknown";
        this.basicSalary=20000.0;
        counter++;
    }
    
     Employee(String name, double basicSalary){
        this.id=counter;
        this.name=name;
        this.basicSalary=basicSalary;
        counter++;
    }

    public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public double getBasicSalary() {
		return basicSalary;
	}
	
    
	
	public static void main(String[] args) {
	    
	    Employee e1=new Employee("Darshan" ,30000);
	    Employee e2=new Employee("Kunal", 25000);
	
	     System.out.println("Employee 1 details: ID"+e1.getId()+", name="+e1.getName()+", Basic Salary is="+e1.getBasicSalary());
	     
	     System.out.println("Employee 2 details: ID"+e2.getId()+", name="+e2.getName()+", Basic Salary is="+e2.getBasicSalary());

	    

	    
	    
	}
	
}

/*

OUTPUT

Employee 1 details: ID1001, name=Darshan, Basic Salary is=30000.0
Employee 2 details: ID1002, name=Kunal, Basic Salary is=25000.0
*/
