import java.util.*;

public class KthMaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        
        Arrays.sort(arr);
        
        System.out.println("Kth smallest: " + arr[k - 1]);
        System.out.println("Kth largest: " + arr[n - k]);
        sc.close();
    }
}