
import java.util.*;

class SubstractionOfMAtrix {

    // display matrix

    static void display(int [][] arr){
        for(int i=0;i<arr.length;i++){
               for(int j=0;j<arr.length;j++){
                 System.out.print(arr[i][j]+ " ");
               }
               System.out.println();
           }
    }

   static int[][] substraction(int [][] mat1, int mat2[][]){

	int sub_Mat[][]= new int[mat1.length][mat2.length];

	 for(int i=0;i<mat1.length;i++){
               for(int j=0;j<mat2.length;j++){
                  sub_Mat[i][j] =mat1[i][j] - mat2[i][j];
               }
           }

	return sub_Mat;
   }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter which type of matrix you want to create: ");
        int n =sc.nextInt();
        
        int [][] mat1 = new int [n][n];
 	int [][] mat2 = new int [n][n];
        
        System.out.println("Enter the elemenet "+n*n+ " in 1st Matrix");
          for(int i=0;i<n;i++){
               for(int j=0;j<n;j++){
                   mat1[i][j] = sc.nextInt();
               }
           }

	System.out.println();
	System.out.println("Enter the elemenet "+n*n+ " in 2nd Matrix");
        for(int i=0;i<n;i++){
               for(int j=0;j<n;j++){
                   mat2[i][j] = sc.nextInt();
               }
           }

        System.out.println();
        System.out.println("Show 1st Matrix");
        display(mat1);


 	System.out.println();
        System.out.println("Show 2nd Matrix");
        display(mat2);

	System.out.println();
        System.out.println("Show Substraction Matrix");
	int sub[][]=substraction(mat1, mat2);
	display(sub);
    }
}