class CheckNumber{
	
	public static void isPositiveNumber(int num){
		
		if( num >= 0) {
		System.out.println("number "+num +" is positive");
		}
		else {
		System.out.println("number "+num +" is negative");
		}
	}
	public static void main(String [] args){
		int num=Integer.parseInt(args[0]);
		
		isPositiveNumber(num);
	}

}