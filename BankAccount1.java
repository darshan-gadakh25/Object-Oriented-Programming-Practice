
public class BankAccount {

	String accountHolderName;
	double balance;
	
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
	
	
	public static void main(String[] args) {
		BankAccount ac1=new BankAccount("Darshan", 8500);
		
		System.out.println("The Accountant 1 Details is:"+ac1.accountHolderName+", Balance is= "+ac1.getBalance());
	
	}
	
}

/*

OUTPUT

The Accountant 1 Details is:Darshan, Balance is= 8500.0
*/
