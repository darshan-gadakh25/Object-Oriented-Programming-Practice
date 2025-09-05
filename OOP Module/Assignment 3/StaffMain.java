import java.util.Scanner;

class Staff {
    String name;
    double salary;

    Staff(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

class TeachingStaff extends Staff {
    String subject;

    TeachingStaff(String name, double salary, String subject) {
        super(name, salary);
        this.subject = subject;
    }

    void display() {
        System.out.println(name + " → " + subject + ", " + (int)salary);
    }
}

class NonTeachingStaff extends Staff {
    String department;

    NonTeachingStaff(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    void display() {
        System.out.println(name + " → " + department + ", " + (int)salary);
    }
}

public class StaffMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        double salary = sc.nextDouble();
        String subject = sc.next();
        TeachingStaff t = new TeachingStaff(name, salary, subject);
        t.display();

        name = sc.next();
        salary = sc.nextDouble();
        String dept = sc.next();
        NonTeachingStaff nt = new NonTeachingStaff(name, salary, dept);
        nt.display();
    }
}
