import java.util.*;

public class ChocolateDistribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of packets: ");
        int n = sc.nextInt();
        
        int[] packets = new int[n];
        System.out.println("Enter chocolates in each packet:");
        for (int i = 0; i < n; i++) {
            packets[i] = sc.nextInt();
        }
        
        System.out.print("Enter number of students: ");
        int m = sc.nextInt();
        
        if (m > n) {
            System.out.println("Not enough packets");
            return;
        }
        
        Arrays.sort(packets);
        
        int minDiff = Integer.MAX_VALUE;
        
        for (int i = 0; i <= n - m; i++) {
            int diff = packets[i + m - 1] - packets[i];
            minDiff = Math.min(minDiff, diff);
        }
        
        System.out.println("Minimum difference: " + minDiff);
        sc.close();
    }
}