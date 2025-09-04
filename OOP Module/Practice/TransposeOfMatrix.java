
import java.util.*;

class TransposeOfMatrix {

    // display matrix

    static void display(int [][] arr){
        for(int i=0;i<arr.length;i++){
               for(int j=0;j<arr.length;j++){
                 System.out.print(arr[i][j]+ " ");
               }
               System.out.println();
           }
    }

   static int[][] transpose(int [][] mat1){

	int tra_Mat[][]= new int[mat1.length][mat1.length];

	 for(int i=0;i<mat1.length;i++){
               for(int j=0;j<mat1.length;j++){
                  tra_Mat[i][j] =mat1[j][i] ;
               }
           }

	return tra_Mat;
   }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter which type of matrix you want to create: ");
        int n =sc.nextInt();
        
        int [][] mat1 = new int [n][n];
        
        System.out.println("Enter the elemenet "+n*n+ " in 1st Matrix");
          for(int i=0;i<n;i++){
               for(int j=0;j<n;j++){
                   mat1[i][j] = sc.nextInt();
               }
           }

	
	System.out.println();
        System.out.println("Show Original Matrix");
	display(mat1);


	System.out.println();
        System.out.println("Show transpose Matrix");
	int tra[][]=transpose(mat1);
	display(tra);
    }
}