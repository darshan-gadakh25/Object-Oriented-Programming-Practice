import java.util.*;

public class LeapYear{
	static int res =0;
	static boolean isLeapYear(int n) {
		boolean result = ( n % 400 == 0 || n % 4 == 0 && n % 100 !=0 ) ? true : false;
		return result;
    }
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num = sc.nextInt();
		
		boolean result= isLeapYear(num);
		System.out.println("output :"+result);
		if(result){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
		
	}
}