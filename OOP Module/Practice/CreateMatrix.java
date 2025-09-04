
import java.util.*;

class CreateMatrix {

    // display matrix
    static void display(int [][] arr){
        for(int i=0;i<arr.length;i++){
               for(int j=0;j<arr.length;j++){
                 System.out.print(arr[i][j]+ " ");
               }
               System.out.println();
           }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter which type of matrix you want to create: ");
        int n =sc.nextInt();
        
        int [][] arr = new int [n][n];
        
           System.out.println("Enter the elemenet in "+n+" X "+n+ " Matrix");
           for(int i=0;i<n;i++){
               for(int j=0;j<n;j++){
                   arr[i][j] = sc.nextInt();
               }
           }
        System.out.println();
        System.out.println("Show  "+n+" X "+n+ " Matrix");
        display(arr);
    }
}