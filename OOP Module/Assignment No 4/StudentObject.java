class Student{
    String name;

    Student(String name){
        this.name=name;
 System.out.println("Student Object for "+name+" is being garbage collected");

    }

    // @Override
    // protected void finalize() throws Throwable {
       
    //     System.out.println("Student Object for "+name+" is being garbage collected");
    // }
   
}
public class StudentObject {
    
    public static void main(String[] args) {
        Student st=new Student("Amit");
        st = null;

        System.gc();
    }
}

/*
 * PS F:\java\OOP Module\Assignment 2\OOP Module\Assignment No 4> java StudentObject
Student Object for Amit is being garbage collected
 */