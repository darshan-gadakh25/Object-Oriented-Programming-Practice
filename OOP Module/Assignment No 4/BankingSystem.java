import java.util.Scanner;

public class BankingSystem {
     private final int accountId; 

  
    public BankingSystem(int accountId) {
        this.accountId = accountId;
    }

    public void displayAccountId() {
        System.out.println("Account ID = " + accountId + " (cannot be changed)");
    }

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account ID:");
        int id = sc.nextInt();

        BankingSystem account = new BankingSystem(id);
        account.displayAccountId();
    }   
}

/*
 * PS F:\java\OOP Module\Assignment 2\OOP Module\Assignment No 4> java BankingSystem
Enter Account ID:
101
Account ID = 101 (cannot be changed)
 */