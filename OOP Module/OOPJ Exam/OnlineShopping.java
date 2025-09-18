
import java.util.*;
public class OnlineShopping  {
	public static void calculation(int unit,int quantity, double [] prices, int index){
			try{
				for(int i=0;i< prices.length;i++){
					try{
					
						int totalPrice= (int) prices[i] * quantity;
						System.out.println(totalPrice / unit);
						
					}catch(ArithmeticException e){
					System.out.println("Arithmetic Exception caugth");
					}
					int getorder = (int) prices[index];
				}
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Or");
				System.out.println("Array Index Exception");
			}
	}
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		
		int unit =sc.nextInt();
		int quantity=sc.nextInt();
		
		double [] prices =new double[quantity];
		
		for(int i=0;i<prices.length;i++){
			prices[i]=sc.nextDouble();
		}
		int index =sc.nextInt();
		
		calculation(unit, quantity, prices,index);
		
		
	}
}