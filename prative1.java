public class prative1 {

	String accountHolderName;
	double balance;

	prative1(){
		System.out.println("Default");
	}
	
	prative1( String accountHolderName, double balance) {
		this();
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
		prative1 ac1=new prative1("Darshan", 8500);
		
		System.out.println("The Accountant 1 Details is:"+ac1.accountHolderName+", Balance is= "+ac1.getBalance());
	
	}
	
}