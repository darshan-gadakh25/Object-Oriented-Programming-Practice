import java.util.Scanner;

public class LargestElementRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int largest = findLargest(arr, n - 1);
        System.out.println("Largest element: " + largest);
        sc.close();
    }
    
    static int findLargest(int[] arr, int n) {
        if (n == 0) return arr[0];
        return Math.max(arr[n], findLargest(arr, n - 1));
    }
}