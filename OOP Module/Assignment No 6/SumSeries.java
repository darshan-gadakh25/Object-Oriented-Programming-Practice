import java.util.*;

public class SumSeries{
	static double sum=0;
	static double series(int n, double i) {
		
		if(i > n){
			return sum;
		}
		else{
			if( i % 2 == 0)
				sum -= (1/i);
			else
				sum += (1/i);
			
			return series(n , i +1);
		}
    }
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num = sc.nextInt();
		
		double sum =series(num,1);	
		System.out.println(sum);
	}
}