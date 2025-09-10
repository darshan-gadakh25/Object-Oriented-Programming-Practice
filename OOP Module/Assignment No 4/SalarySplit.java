import java.util.Scanner;

public class SalarySplit {

    public static void divideBonus(int employee, int bonus){
        try {
            int calBonus = employee / bonus;
            System.out.println("The Bonus for each Employee: "+calBonus);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero not allowed");
        }
    }
    

    public static void main(String[] args) {
     Scanner sc =new Scanner(System.in);

     System.out.println("Enter Employee: ");
     int employee=sc.nextInt();

     System.out.println("Enter bonus: ");
     int bonus=sc.nextInt();

    
     System.out.println("Output: ");
        divideBonus(employee,bonus);
    }
}
/*
 * 
 * PS F:\java\OOP Module\Assignment 2\OOP Module\Assignment No 4> java SalarySplit      
Enter Employee: 
1000
Enter bonus: 
0
Output: 
Division by zero not allowed
 */