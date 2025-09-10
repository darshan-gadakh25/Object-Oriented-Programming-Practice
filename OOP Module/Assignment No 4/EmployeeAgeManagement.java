import java.util.Scanner;

public class EmployeeAgeManagement {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any integer value: ");
        int value=sc.nextInt();

        Integer intValue= Integer.valueOf(value);

        System.out.println("Integer object:"+intValue);
        System.out.println( intValue instanceof Integer);
    }
}

/*
 * 
 * PS F:\java\OOP Module\Assignment 2\OOP Module\Assignment No 4> java EmployeeAgeManagement
Enter any integer value: 
32
Integer object:32
true
 */