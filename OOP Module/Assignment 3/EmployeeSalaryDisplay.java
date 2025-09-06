class Employee {
    String name;
    double salary;
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    void displaySalary() {
        System.out.println(name + " Salary = " + salary);
    }
}

class Manager extends Employee {
    Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    void displaySalary() {
        double totalSalary = salary + (salary * 0.20);
        System.out.println(name + " Total Salary = " + totalSalary);
    }
}

class Developer extends Employee {
    Developer(String name, double salary) {
        super(name, salary);
    }
    @Override
    void displaySalary() {
        double totalSalary = salary + (salary * 0.10);
        System.out.println(name + " Total Salary = " + totalSalary);
    }
}

class EmployeeSalaryDisplay {
    public static void main(String[] args) {
        Manager m = new Manager("Anita", 50000);
        Developer d = new Developer("Rohit", 40000);
        m.displaySalary();
        d.displaySalary();
    }
}