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

class TeachingStaff extends Employee {
    String subject;

    TeachingStaff(String name, double salary, String subject) {
        super(name, salary);
        this.subject = subject;
    }

    @Override
    void displaySalary() {
        System.out.println(name + " → Subject=" + subject + ", Salary=" + salary);
    }
}

class Professor extends TeachingStaff {
    String specialization;

    Professor(String name, double salary, String subject, String specialization) {
        super(name, salary, subject);
        this.specialization = specialization;
    }

    @Override
    void displaySalary() {
        System.out.println(name + " → Subject=" + subject + ", Specialization=" + specialization + ", Salary=" + salary);
    }
}

class Lecturer extends TeachingStaff {
    String department;

    Lecturer(String name, double salary, String subject, String department) {
        super(name, salary, subject);
        this.department = department;
    }

    @Override
    void displaySalary() {
        System.out.println(name + " → Subject=" + subject + ", Department=" + department + ", Salary=" + salary);
    }
}

public class CollegeStaff {
    public static void main(String[] args) {
        Professor pr = new Professor("Dr. Sharma", 80000, "Math", "Algebra");
        Lecturer le = new Lecturer("Ms. Mehta", 50000, "Physics", "Science");
        pr.displaySalary();
        le.displaySalary();
    }
}