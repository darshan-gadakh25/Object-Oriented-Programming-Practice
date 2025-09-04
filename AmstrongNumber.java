import java.util.Scanner;
class AmstrongNumber {

	public static void isAmstrongNumber() {

	for( int i=0;i<=1000; i++) {
        int num= i;
	int sum=0;
	while(num > 0){
		int rem= num % 10 ;
		sum= sum + (rem *rem *rem);
		num /= 10;
        }
          
	if(i == sum) {
	  System.out.print(" "+i);
	}
      }
    }

	public static void main(String [] args){
		

   	 isAmstrongNumber();
	
    }
}