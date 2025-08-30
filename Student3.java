
public class Student3 {

	int rollNo;
	String name;
	double marks;
	
	Student3(int rollNo, String name, double marks) {
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}


	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	
	
	public static void main(String[] args) {
		Student3 s1=new Student3(10, "Darshan", 85);
		
		System.out.println("Before update the value:");
		System.out.println("Student: Name="+s1.name+", Roll No= "+s1.name+", Marks="+s1.marks);
		
		s1.setMarks(90);
		
		System.out.println("After update the value:");
		System.out.println("Student: Name="+s1.name+", Roll No= "+s1.name+", Marks="+s1.marks);

	}
	
}

/*

OUTPUT

Before update the value:
Student: Name=Darshan, Roll No= Darshan, Marks=85.0
After update the value:
Student: Name=Darshan, Roll No= Darshan, Marks=90.0

*/
