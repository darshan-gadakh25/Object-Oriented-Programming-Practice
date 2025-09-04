import java.util.Scanner;
public class LockerNumber { 
  

  public static void main(String[] args) { 
   
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter locker number: ");
    int locker = sc.nextInt();

  
	if(locker % 2  == 0){
	     System.out.println("Even locker number: ");
        }
	else {
	     System.out.println("odd locker number: ");
        }
    }
}

/*

OUtPUT:--
Enter transaction amount:
2500
What do you want to Withdraw  or Deposit:
Withdraw

Withdrawal transactionEnter salary for Company 1:
45000
Enter salary for Company 2:
52000

Enter salary for Company 3:
50000

Company 2 offers the highest salary.
*/
