import java.util.Scanner;

public class FindDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size (n+1): ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter elements (1 to n-1 with one duplicate):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Floyd's cycle detection
        int slow = arr[0];
        int fast = arr[0];
        
        do {
            slow = arr[slow];
            fast = arr[arr[fast]];
        } while (slow != fast);
        
        slow = arr[0];
        while (slow != fast) {
            slow = arr[slow];
            fast = arr[fast];
        }
        
        System.out.println("Duplicate number: " + slow);
        sc.close();
    }
}