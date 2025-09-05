import java.util.Scanner;

class Employee {
    String name;
    double basicSalary;

    Employee(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }

    double getNetSalary() {
        return basicSalary;
    }
}

class RegularEmployee extends Employee {

    RegularEmployee(String name, double basicSalary) {
        super(name, basicSalary);
    }

    @Override
    double getNetSalary() {
        return basicSalary + (basicSalary * 0.10);
    }
}

class ContractEmployee extends Employee {

    ContractEmployee(String name, double basicSalary) {
        super(name, basicSalary);
    }

    @Override
    double getNetSalary() {
        return basicSalary + (basicSalary * 0.05);
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        double basicSalary = sc.nextDouble();
        RegularEmployee re = new RegularEmployee(name, basicSalary);
        System.out.println(name + " Net Salary = " + (int)re.getNetSalary());

        name = sc.next();
        basicSalary = sc.nextDouble();
        ContractEmployee ce = new ContractEmployee(name, basicSalary);
        System.out.println(name + " Net Salary = " + (int)ce.getNetSalary());
    }
}
