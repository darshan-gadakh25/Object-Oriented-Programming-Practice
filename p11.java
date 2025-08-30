
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
	
	public String calculateGrade(){
	    if(marks >= 80) return "A";
	    else if(marks < 80  && marks>=60) return "B";
	    else if(marks < 60  && marks>=40) return "c";
	    else return "F";
	}
	
	
	
	public static void main(String[] args) {
		Student3 s1=new Student3(10, "Darshan", 85);
		
		System.out.println("Before update the value:");
		System.out.println("Student: Name="+s1.name+", Roll No= "+s1.name+", Marks="+s1.marks);
		
		s1.setMarks(90);
		
		System.out.println("After update the value:");
		System.out.println("Student: Name="+s1.name+", Roll No= "+s1.name+", Marks="+s1.marks);
		
		System.out.println("The Grade of Student");
		Student3 s2=new Student3(13, "Kunal", 93);
		Student3 s3=new Student3(15, "Vishal", 45);
		
		System.out.println("The Grade of Student= "+s2.name+" is "+	s2.calculateGrade());
		System.out.println("The Grade of Student= "+s3.name+" is "+	s3.calculateGrade());

	}
	
}

/*

OUTPUT

Before update the value:
Student: Name=Darshan, Roll No= Darshan, Marks=85.0
After update the value:
Student: Name=Darshan, Roll No= Darshan, Marks=90.0
The Grade of Student
The Grade of Student= Kunal is A
The Grade of Student= Vishal is c

*/
