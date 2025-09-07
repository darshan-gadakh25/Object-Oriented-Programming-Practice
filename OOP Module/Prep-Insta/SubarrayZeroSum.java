import java.util.*;

public class SubarrayZeroSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        Set<Integer> sums = new HashSet<>();
        int sum = 0;
        
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            
            if (sum == 0 || sums.contains(sum)) {
                System.out.println("Subarray with sum 0 exists");
                return;
            }
            
            sums.add(sum);
        }
        
        System.out.println("No subarray with sum 0 exists");
        sc.close();
    }
}