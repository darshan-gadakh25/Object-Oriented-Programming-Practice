
public class BankAccount {

	String accountHolderName;
	double balance;
	static String bankName="CDAC bank";
	
	BankAccount( String accountHolderName, double balance) {
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}


	public double getBalance() {
		return balance;
	}

	public void setBalancw(double balance) {
		this.balance = balance;
	}
	
	public double deposit(double amount){
	    return balance + amount;
	}
	
	public double withdraw(double amount){
	    return balance - amount;
	}
	
	public String displayBankName(){
	    return bankName;
	}
	
	public static void main(String[] args) {
		BankAccount ac1=new BankAccount("Darshan", 8500);
		
		System.out.println("The Accountant 1 Details is:"+ac1.accountHolderName+", Balance is= "+ac1.getBalance());
	
	    BankAccount ac2=new BankAccount("Kiran", 10000);
	    BankAccount ac3=new BankAccount("Amit", 15000);
	    
	    System.out.println("The Accountant name "+ac2.accountHolderName+" balance after deposite is:"+ ac2.deposit(2000));
	    
	    System.out.println("The Accountant name "+ac3.accountHolderName+" balance after withdraw is:"+ ac3.withdraw(5000));
	    
	     System.out.println("The bank name of Accountant "+ac3.accountHolderName+" is "+ ac3.displayBankName());

	    

	    
	    
	}
	
}

/*

OUTPUT
The Accountant 1 Details is:Darshan, Balance is= 8500.0
The Accountant name Kiran balance after deposite is:12000.0
The Accountant name Amit balance after withdraw is:10000.0
The bank name of Accountant isAmit is CDAC bank
*/
