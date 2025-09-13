import java.util.ArrayList;
import java.util.List;

class Student{
    private String name;
    private String grade;

    Student(String name, String grade){
        this.name=name;
        this.grade=grade;
    }

    public String getName(){
        return name;
    }

    public void setname(String name){
        this.name=name;
    }


    public String getGrade(){
        return grade;
    }

    public void setGrade(String grade){
        this.grade=grade;
    }
    
    @Override
    public String toString(){
        return name+" : "+grade;
    }

}
public class StudentRecordSystem {
    public static void main(String[] args) {
        List<Student> students=new ArrayList<>();
        students.add(new Student("Amit", "A"));
        students.add(new Student("Priya", "B"));

        System.out.println("Student Records" +students);
        // for (Student student : students) {
        //     System.out.println(student);
        // }
    }
    
}
