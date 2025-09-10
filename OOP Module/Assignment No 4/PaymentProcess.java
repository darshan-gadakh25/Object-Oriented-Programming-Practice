import java.util.Scanner;

public class PaymentProcess {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Amount as string: ");
        String str1=sc.next();

        System.out.println("Enter Additional amount to add: ");
        String str2=sc.next();

        int num1=Integer.parseInt(str1);
        int num2=Integer.parseInt(str2);
        int result = num1 +num2;
        System.out.println(num1 +" + "+ num2 +": " +result);
    }
}
/*
Enter Amount as string: 
1000
Enter Additional amount to add: 
500
1000 + 500: 1500
 */