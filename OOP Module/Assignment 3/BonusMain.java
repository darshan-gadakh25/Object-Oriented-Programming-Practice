import java.util.Scanner;

abstract class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    abstract double calculateBonus();
}

class Manager extends Employee {
    Manager(String name, double salary) {
        super(name, salary);
    }

    double calculateBonus() {
        return salary * 0.20;
    }
}

class Developer extends Employee {
    Developer(String name, double salary) {
        super(name, salary);
    }

    double calculateBonus() {
        return salary * 0.10;
    }
}

public class BonusMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        double salary = sc.nextDouble();
        Manager m = new Manager(name, salary);
        System.out.println(name + " Bonus = " + (int)m.calculateBonus());

        name = sc.next();
        salary = sc.nextDouble();
        Developer d = new Developer(name, salary);
        System.out.println(name + " Bonus = " + (int)d.calculateBonus());
    }
}
