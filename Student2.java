
public class Student2 {

	String stdName;
	String className;
	static double tutionFee;
	
	static {
		tutionFee = 30000;
		System.out.println("School Tuition Fee Initialized: "+tutionFee);
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}
	
	public static void main(String[] args) {
		Student2 s1= new Student2();
		s1.setStdName("Anjili");
		s1.setClassName("10th");
		
		Student2 s2= new Student2();
		s2.setStdName("Vikram");
		s2.setClassName("12th");
		
		System.out.println("Student1: Name="+s1.getStdName()+", Class= "+s1.getClassName()+", Tution Fee ="+tutionFee);
		System.out.println("Student2: Name="+s2.getStdName()+", Class= "+s2.getClassName()+", Tution Fee ="+tutionFee);

	}
}

/*

OUTTPUT

School Tuition Fee Initialized: 30000.0
Student1: Name=Anjili, Class= 10th, Tution Fee =30000.0
Student2: Name=Vikram, Class= 12th, Tution Fee =30000.0

*/
