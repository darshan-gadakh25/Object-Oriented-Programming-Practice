import java.util.Scanner;

public class OnlineExamination {
    
        public static void markValidation(int marks){
            try{
                if(marks < 0 || marks >100) {
                    throw new CustomException("Invalid Marks");
                }
                System.err.println("Marks: "+marks);
            }catch(CustomException e){
                System.out.println(e.getMessage());
            }
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Marks: ");
        int marks=sc.nextInt();

        markValidation(marks);
    }
}

/*
 * PS F:\java\OOP Module\Assignment 2\OOP Module\Assignment No 4> java OnlineExamination      
Enter the Marks: 
89
Marks: 89
PS F:\java\OOP Module\Assignment 2\OOP Module\Assignment No 4> javac OnlineExamination.java
PS F:\java\OOP Module\Assignment 2\OOP Module\Assignment No 4> java OnlineExamination      
Enter the Marks: 
-87
Invalid Marks
 */