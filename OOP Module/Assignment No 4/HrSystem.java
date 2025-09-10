import java.util.Scanner;

public class HrSystem {

    public static void salariesManage(int salaries[], int hour, int index){

        try{
            try {
                int getsalary=salaries[index];
                int hourlySalary=salaries[index] / hour;
                
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invaid index");
            }

        }catch(ArithmeticException e){
            System.out.println("Devision by Zero: ");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the how many employees in company: ");
        int n = sc.nextInt();

        int [] salaries= new int[n];
        System.out.println("Enter the salaries of employee: ");
        for(int sal: salaries){
            salaries[sal]=sc.nextInt();
        }

        System.out.println("Enter the hours to divide the employee salary: ");
        int hour=sc.nextInt();

        System.out.println("enter the index for getting the salary of employee: ");
        int index=sc.nextInt();

        salariesManage(salaries, hour, index);


    }
}

/*
 * 
 * PS F:\java\OOP Module\Assignment 2\OOP Module\Assignment No 4> java HrSystem
Enter the how many employees in company:                                             
2                                                                                    
Enter the salaries of employee:                                                      
5000 6000                                                                            
Enter the hours to divide the employee salary:                                       
0
enter the index for getting the salary of employee: 
5
Invaid index
PS F:\java\OOP Module\Assignment 2\OOP Module\Assignment No 4> java HrSystem
Enter the how many employees in company: 
2
Enter the salaries of employee: 
5000 6000
Enter the hours to divide the employee salary: 
0
enter the index for getting the salary of employee: 
1
Devision by Zero: 
 */
