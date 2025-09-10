import java.util.Scanner;

public class Salarystorage {
    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);
        System.out.println("Enter the salary");
        double num=sc.nextDouble();

        Double d1=Double.valueOf(num);

        System.out.println("Double object: "+d1);
        System.out.print("Is the salary is in wrapper object: ");
        System.out.println(d1 instanceof Double);

    }
}
/*
 * 
 * PS F:\java\OOP Module\Assignment 2\OOP Module\Assignment No 4> java Salarystorage
Enter the salary
5400.88
Double object: 5400.88
Is the salary is in wrapper object: true
 */
