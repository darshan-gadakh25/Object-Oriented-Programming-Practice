import java.util.Scanner;

public class SmallestElementRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int smallest = findSmallest(arr, n - 1);
        System.out.println("Smallest element: " + smallest);
        sc.close();
    }
    
    static int findSmallest(int[] arr, int n) {
        if (n == 0) return arr[0];
        return Math.min(arr[n], findSmallest(arr, n - 1));
    }
}