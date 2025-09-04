class ButterflyPattern {

	public static void main(String [] args){
		
		  int n=5;
		for( int i=1;i<=5;i++) {
		   for(int j=1;j<=i;j++){
			System.out.print("*");
		   }
		   for(int sp = 1 ;sp< 2 *(n - i);sp++){	
		        System.out.print(" ");
		   }
		   for(int j=1;j<=i;j++){
			System.out.print("*");
		   }		
		System.out.println();
		}

		for ( int i=n-1;i>=1;i--) {
		  for(int j=1;j<=i;j++){
		        System.out.print("*");
		 }
 		  for(int sp =1 ;sp<=2 * (n - i);sp++){	
		        System.out.print(" ");
		   }
		 for(int j=1;j<=i;j++){
		        System.out.print("*");
		 }	
		System.out.println();

		}		
	}
}