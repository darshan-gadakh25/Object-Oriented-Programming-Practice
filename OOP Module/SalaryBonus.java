import java.util.Scanner;
public class SalaryBonus {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total purchase amount: ");
        double salary = sc.nextDouble();

	System.out.print("Enter years of service: ");
        int year = sc.nextInt();

	double bonus = 0 ;
        if (year > 5) {
            bonus = salary * 5 / 100;
        }
        System.out.println("Final cost after discount: " + bonus);

    }
}

/* 
OUTPUT

 java SalaryBonus
Enter total purchase amount: 50000
Enter years of service: 6
Final cost after discount: 2500.0


*/