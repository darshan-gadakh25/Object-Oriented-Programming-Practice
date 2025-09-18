import java.util.*;

public class SquareNumber1{
	static int squarRoot(int n) {
        int res = 1;
		
		if( res > n){
			return 0;
		}
        else{
			res++;
			return res * res <= squarRoot(n) ;
		}
       
    }
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num = sc.nextInt();
		
			System.out.println(squarRoot(num));
		
	}
}