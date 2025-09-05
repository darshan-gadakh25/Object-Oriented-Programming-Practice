import java.util.Scanner;

public class Student {
    private  int marks;

    public int getMarks() {
        return marks;
    }


    public void setMarks(int marks) {
        this.marks = marks;
    }

    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        System.out.println("Marks:");
        int marks=sc.nextInt();

        Student s1= new Student();
        s1.setMarks(marks);

        System.out.println("Marks: "+ s1.getMarks());
       
    }

    
}
