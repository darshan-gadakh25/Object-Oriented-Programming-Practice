import java.util.Scanner;
public class Transaction { 
  
  public static void withdraw (int amount) {
 	 System.out.println("Withdrawal transaction");
  }

 public static void deposite (int amount) {
    System.out.println("Deposited transaction :");
  }

  public static void main(String[] args) { 
   
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter transaction amount: ");
    int amount = sc.nextInt();

    System.out.println("What do you want to Withdraw  or Deposit: ");
    String ope=sc.next();
    System.out.println();

	
   switch (ope) {
   case "Withdraw":
     withdraw(amount);
	break;
      
   case "Deposite":
     deposite(amount);
	break;
   default :
        System.out.println("no transaction :");
	break;
  }
}
}

/*

OUtPUT:--
 java HighestSalary
Enter salary for Company 1:
45000
Enter salary for Company 2:
52000

Enter salary for Company 3:
50000

Company 2 offers the highest salary.
*/
