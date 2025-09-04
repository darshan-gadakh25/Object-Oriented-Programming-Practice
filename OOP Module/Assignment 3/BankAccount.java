import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class BankAccount {
    private double balance;

    public  double deposite(double amount){
        balance=balance + amount;
        return balance ;
    }

    
     public double withdraw(double amount){

        
        if( balance > amount){
           balance = balance - amount;
        } 
        else{
            System.out.println("Insufficient balance:");
        }

        return balance;
    }

    
    public double getBalance(){
        return balance;

    }
    

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Deposite: ");
        double balance=sc.nextDouble();

        System.out.println("withdraw: ");
        double amount=sc.nextDouble();

        BankAccount ac= new BankAccount();
        ac.deposite(balance);
        ac.withdraw(amount);

        System.out.println("updated Balance: "+ac.getBalance());


    }
}

/*
 * 
 * Input
Deposite: 5000
withdraw:2000

output:
updated Balance: 3000.0
 */