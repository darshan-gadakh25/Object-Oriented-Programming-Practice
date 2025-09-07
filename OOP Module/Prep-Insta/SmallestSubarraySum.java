import java.util.Scanner;

public class SmallestSubarraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Enter target sum: ");
        int target = sc.nextInt();
        
        int minLength = Integer.MAX_VALUE;
        int left = 0, sum = 0;
        
        for (int right = 0; right < n; right++) {
            sum += arr[right];
            
            while (sum >= target && left <= right) {
                minLength = Math.min(minLength, right - left + 1);
                sum -= arr[left];
                left++;
            }
        }
        
        if (minLength == Integer.MAX_VALUE) {
            System.out.println("No subarray found");
        } else {
            System.out.println("Smallest subarray length: " + minLength);
        }
        sc.close();
    }
}