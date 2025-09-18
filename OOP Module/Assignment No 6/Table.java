import java.util.*;

public class Table{
	
	static int recursiveTable(int n, int i) {
		
		if(i == 11){
			return 0;
		}
		else{
			System.out.println(n+" x" +i +" = "+n * i);
			return recursiveTable( n, i +1);
		}
    }
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num = sc.nextInt();
		
		recursiveTable(num,1);	
	}
}