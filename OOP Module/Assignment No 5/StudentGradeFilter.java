import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentGradeFilter {
    public static void main(String[] args) {
        List<Student> students=new ArrayList<>();
        students.add(new Student("Amit", "A"));
        students.add(new Student("Priya", "B"));
        students.add(new Student("Rohan", "C"));
        students.add(new Student("Rohan", "V"));
        
       
    // List<Student> students=new ArrayList<>();

    Iterator<Student> iterator= students.iterator();

        // for (Student student : students) {
        //     if(student.getGrade().compareTo("B") > 0){
        //             students.remove(student);
        //     }
        // }
        while (iterator.hasNext()) {
            Student s=iterator.next();

            if(s.getGrade().compareTo("B") > 0){
                iterator.remove();
            }
        }

        System.out.println("Qualified Student: "+students);
    }
}
