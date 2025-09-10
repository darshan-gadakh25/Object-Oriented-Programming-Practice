import java.util.Scanner;
class MyException extends Exception {
    
    MyException(String msg){
        super(msg);
    }
}

public class WorkshopRegistration  {
    
    public static void ckeckAge(int age) throws MyException{
            if(age >= 18){
                System.out.println("You are eligible for Registration");
            }
            else{
                throw new MyException("AgeNotValidException: Age must be ≥ 18");
            }
    }

    public static void main(String[] args) throws MyException{
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age =sc.nextInt();

        ckeckAge(age);
    }
}
