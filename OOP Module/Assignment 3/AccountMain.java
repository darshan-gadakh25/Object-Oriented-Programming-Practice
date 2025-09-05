import java.util.Scanner;

class Account {
    int accountNo;
    double balance;

    Account(int accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }
}

class SavingAccount extends Account {
    double interestRate;

    SavingAccount(int accountNo, double balance, double interestRate) {
        super(accountNo, balance);
        this.interestRate = interestRate;
    }

    void display() {
        System.out.println("Saving → " + accountNo + ", Balance=" + (int)balance + ", Interest=" + (int)interestRate + "%");
    }
}

class CurrentAccount extends Account {
    double overdraftLimit;

    CurrentAccount(int accountNo, double balance, double overdraftLimit) {
        super(accountNo, balance);
        this.overdraftLimit = overdraftLimit;
    }

    void display() {
        System.out.println("Current → " + accountNo + ", Balance=" + (int)balance + ", Overdraft=" + (int)overdraftLimit);
    }
}

public class AccountMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int accNo = sc.nextInt();
        double bal = sc.nextDouble();
        double interest = sc.nextDouble();
        SavingAccount sa = new SavingAccount(accNo, bal, interest);
        sa.display();

        accNo = sc.nextInt();
        bal = sc.nextDouble();
        double od = sc.nextDouble();
        CurrentAccount ca = new CurrentAccount(accNo, bal, od);
        ca.display();
    }
}
