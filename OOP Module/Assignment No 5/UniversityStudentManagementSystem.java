
import java.util.*;
import java.lang.*;

class Student implements Comparable<Student> {
    String name;
    int rollNo;
    String department;
    double ccpa;

    Student(int rollNo, String name, String department, double ccpa) {
        this.name = name;
        this.rollNo = rollNo;
        this.department = department;
        this.ccpa = ccpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getCcpa() {
        return ccpa;
    }

    public void setName(double ccpa) {
        this.ccpa = ccpa;
    }

    @Override
    public String toString() {
        return "[ name: " + name + " ,rollNo: " + rollNo + ", department: " + department + ", ccpa: " + ccpa + "]";
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }

    // Double.compare(this.ccpa, o.ccpa);
}

class SortingStudentName implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }
}

public class UniversityStudentManagementSystem {
    public static void main(String[] ags) {
        List<Student> stdList = new ArrayList<>();
        stdList.add(new Student(101, "Amit", "CS", 8.5));
        stdList.add(new Student(102, "Priya", "Math", 9.2));
        stdList.add(new Student(103, "Rohan", "CS", 7.8));
        stdList.add(new Student(104, "Sneha", "Physics", 4.5));

        System.out.print("Registration Order: ");

        for (Student s : stdList) {
            System.out.print(s.getName() + ",");
        }

        Collections.sort(stdList, Collections.reverseOrder());
        System.out.println();
        System.out.print("Merit List: ");

        for (Student s : stdList) {
            System.out.print(s.getName() + "(" + s.getCcpa() + "),");
        }

        System.out.println();
        System.out.print("Alphabetic  List: ");
        Collections.sort(stdList, new SortingStudentName());

        for (Student s : stdList) {
            System.out.print(s.getName() + ",");
        }

        Map<String, List<String>> mapStudnt = new HashMap<>();
        for (Student s : stdList) {
            if (!mapStudnt.containsKey(s.getDepartment())) {
                mapStudnt.put(s.getDepartment(), new ArrayList<>());
            }
            mapStudnt.get(s.getDepartment()).add(s.getName());

        }
        System.out.println("Department Grouping:");
        for (Map.Entry<String, List<String>> entry : mapStudnt.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        Set<String> uniqueNames = new HashSet<>();
        for (Student s : stdList)
            uniqueNames.add(s.getName());
        System.out.println("Unique Student Names: " + uniqueNames);

        Set<Student> rollSet = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Integer.compare(s1.getRollNo(), s2.getRollNo());
            }
        });
        rollSet.addAll(stdList);

        System.out.println("Roll Number Sorting:");
        for (Student s : rollSet) {
            System.out.println(s);
        }

        Iterator<Student> it = stdList.iterator();
        while (it.hasNext()) {
            if (it.next().getCcpa() < 5.0) {
                it.remove();
            }
        }
        System.out.println("After Performance Filter:");
        for (Student s : stdList)
            System.out.println(s);

        Stack<Student> stack = new Stack<>();
        for (Student s : stdList)
            stack.push(s);
        System.out.println("Recent Registrations:");
        while (!stack.isEmpty())
            System.out.println(stack.pop());

        Queue<Student> queue = new LinkedList<>();
        queue.addAll(stdList);
        System.out.println("Scholarship Queue:");
        while (!queue.isEmpty())
            System.out.println(queue.poll());

        LinkedList<Integer> hostelList = new LinkedList<>();
        hostelList.addFirst(201);
        hostelList.addLast(202);
        hostelList.addLast(203);
        hostelList.addFirst(200);

        System.out.println("Hostel Applications: " + hostelList);
        System.out.println("Allocated (front): " + hostelList.removeFirst());
        System.out.println("Allocated (back): " + hostelList.removeLast());
        System.out.println("Remaining: " + hostelList);

    }

}