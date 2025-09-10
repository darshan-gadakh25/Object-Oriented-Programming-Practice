import java.util.Scanner;


public class RegistrationSystem {
    
    public static void registration(String input) throws CustomException{
        try{
            int number=Integer.parseInt(input);
            System.out.println("The input value is: "+number);
        }catch(Exception e){
            System.out.println("Invalid number format");
        }
    }

    public static void main(String[] args) throws CustomException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter input: ");
        String n=sc.nextLine();

        registration(n);
    }
}

/*
 * 
 * PS F:\java\OOP Module\Assignment 2\OOP Module\Assignment No 4> java RegistrationSystem      
Enter input: 
enghteen
Invalid number format
 */