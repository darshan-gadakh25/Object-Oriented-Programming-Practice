class MirrorImage {

	public static void main(String [] args){
		int n=5;

	
	for(int i=1;i<=n;i++){
	int x=1;
	    for(int sp=1;sp<i;sp++){
		System.out.print(" ");
	    }
	    for(int j=5;j>=i;j--){
	 	System.out.print(" "+i);
		x++;
	    }
   	 System.out.println();
	}
		
	for(int i=2;i<=n;i++){
	    for(int sp=n;sp>i;sp--){
		System.out.print(" ");
	    }
	    for(int j=1;j<=i;j++){
	 	System.out.print(" "+j);
	    }
   	 System.out.println();
	}	
    }
}