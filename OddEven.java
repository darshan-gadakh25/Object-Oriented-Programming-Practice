class OddEven{
	
	public static void OddEven(int num){
		
		if( num %2 == 0) {
		System.out.println("number "+num +" is Even");
		}
		else {
		System.out.println("number "+num +" is Odd");
		}
	}
	public static void main(String [] args){
		int num=Integer.parseInt(args[0]);
		
		OddEven(num);
	}

}