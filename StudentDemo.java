
class Student{
	String name;
	int marks;
	
	static int totalStudents;
	
	

	public Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
		totalStudents++;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public boolean isPassed() {
		if(marks >= 35) {
			return true;
		}
		return false;
	}
	
	public static void showTotalStudents() {
		System.out.println("Total students: "+totalStudents);
	}
	
	
}

public class StudentDemo {

	public static void main(String[] args) {
		
		Student s1= new Student("Rahul", 78);
		Student s2= new Student("Pooja", 34);
		Student s3= new Student("Amit", 65);
		
		System.out.println("Student Rahul Passed?"+s1.isPassed());
		System.out.println("Student Pooja Passed?"+s2.isPassed());
		System.out.println("Student Amit Passed?"+s3.isPassed());
		
		Student.showTotalStudents();
	}

}


/*

OUTPUT

Student Rahul Passed?true
Student Pooja Passed?false
Student Amit Passed?true
Total students: 3

*/
