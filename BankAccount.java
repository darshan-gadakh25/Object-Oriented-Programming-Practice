
public class BankAccount {

	String accountHolderName;
	double balance;
	static double interest;
	
	static {
		interest= 4;
		System.out.println("Bank Interest Rate Initialized: "+interest+"%");
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public static void main(String[] args) {
		BankAccount ac1=new BankAccount();
		ac1.setAccountHolderName("Rohit");
		ac1.setBalance(5000.0);
		
		BankAccount ac2=new BankAccount();
		ac2.setAccountHolderName("Priya");
		ac2.setBalance(15000.0);
		
		System.out.println("Account1: "+ac1.getAccountHolderName()+ ", Balance="+ac1.getBalance()+", Interest Rate= "+interest+"%");
		System.out.println("Account2: "+ac2.getAccountHolderName()+ ", Balance="+ac2.getBalance()+", Interest Rate= "+interest+"%");

	}
}

/*

OUTPUT

 java BankAccount
Bank Interest Rate Initialized: 4.0%
Account1: Rohit, Balance=5000.0, Interest Rate= 4.0%
Account2: Priya, Balance=15000.0, Interest Rate= 4.0%

*/
