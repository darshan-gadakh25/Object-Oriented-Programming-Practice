import java.util.*;

public class MaxScalarProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        
        System.out.println("Enter first array:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        
        System.out.println("Enter second array:");
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        int maxProduct = 0;
        for (int i = 0; i < n; i++) {
            maxProduct += arr1[i] * arr2[i];
        }
        
        System.out.println("Maximum scalar product: " + maxProduct);
        sc.close();
    }
}