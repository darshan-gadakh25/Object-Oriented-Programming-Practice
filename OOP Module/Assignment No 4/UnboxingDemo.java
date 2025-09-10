import java.util.Scanner;

public class UnboxingDemo {
    
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter any integer value: ");
        int value=sc.nextInt();

        Integer intValue= Integer.valueOf(value);

       int newint = intValue.intValue();
       System.out.println("Promitive value: "+newint);
    }
}

/*
 * PS F:\java\OOP Module\Assignment 2\OOP Module\Assignment No 4> java UnboxingDemo
Enter any integer value: 
65
Promitive value: 65
 */