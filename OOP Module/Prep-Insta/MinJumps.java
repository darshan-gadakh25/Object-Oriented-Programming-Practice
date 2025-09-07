import java.util.Scanner;

public class MinJumps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        if (n <= 1) {
            System.out.println("Minimum jumps: 0");
            return;
        }
        
        if (arr[0] == 0) {
            System.out.println("Cannot reach end");
            return;
        }
        
        int jumps = 1;
        int maxReach = arr[0];
        int steps = arr[0];
        
        for (int i = 1; i < n; i++) {
            if (i == n - 1) {
                System.out.println("Minimum jumps: " + jumps);
                return;
            }
            
            maxReach = Math.max(maxReach, i + arr[i]);
            steps--;
            
            if (steps == 0) {
                jumps++;
                if (i >= maxReach) {
                    System.out.println("Cannot reach end");
                    return;
                }
                steps = maxReach - i;
            }
        }
        sc.close();
    }
}