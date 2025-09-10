import java.util.Scanner;

public class LearningManagementSystem {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Initial Text");
        String text1=sc.next();

        System.out.println("Enter Text to insert");
        String text2=sc.next();

        System.out.println("Enter Index");
        int index=sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Text to appends");
        String text3=sc.nextLine();

         StringBuffer str = new StringBuffer(text1);
         try{
            str.insert(index, " " + text2).append(" " + text3);
         }catch(StringIndexOutOfBoundsException e){
            System.out.println("Invalid index! Must be between 0 and " + text1.length());
         }
        

        System.out.println(str);
    }
}

/*
 * PS F:\java\OOP Module\Assignment 2\OOP Module\Assignment No 4> java LearningManagementSystem
Enter Initial Text
Hello
Enter Text to insert
CDAC
Enter Index
5
Enter Text to appends
Java student
 */