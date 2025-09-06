
abstract class Employee {
    protected String name;
    protected int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public abstract double calculateSalary();
}

interface BonusEligible {
    double calculateBonus();
}

class PermanentEmployee extends Employee implements BonusEligible {
    private double basicSalary;
    private double hra;

    public PermanentEmployee(String name, int id, double basicSalary, double hra) {
        super(name, id);
        this.basicSalary = basicSalary;
        this.hra = hra;
    }

    @Override
    public double calculateSalary() {
        return basicSalary + hra;
    }

    @Override
    public double calculateBonus() {
        return calculateSalary() * 0.10;
    }
}

class ContractEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public ContractEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {

        PermanentEmployee emp1 = new PermanentEmployee("Amit", 101, 50000, 5000);
        PermanentEmployee emp2 = new PermanentEmployee("Rahul", 102, 60000, 6000);

        ContractEmployee emp3 = new ContractEmployee("Neha", 201, 300, 100);
        ContractEmployee emp4 = new ContractEmployee("Riya", 202, 400, 120);

        System.out.println(emp1.name + " Salary = " + emp1.calculateSalary() + ", Bonus = " + emp1.calculateBonus());
        System.out.println(emp2.name + " Salary = " + emp2.calculateSalary() + ", Bonus = " + emp2.calculateBonus());

        System.out.println(emp3.name + " Salary = " + emp3.calculateSalary());
        System.out.println(emp4.name + " Salary = " + emp4.calculateSalary());
    }
}