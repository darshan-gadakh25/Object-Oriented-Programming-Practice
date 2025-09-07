import java.util.Scanner;

public class TreppingRainWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        
        int[] height = new int[n];
        System.out.println("Enter heights:");
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }
        
        if (n <= 2) {
            System.out.println("Water trapped: 0");
            return;
        }
        
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }
        
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }
        
        int water = 0;
        for (int i = 0; i < n; i++) {
            water += Math.min(leftMax[i], rightMax[i]) - height[i];
        }
        
        System.out.println("Water trapped: " + water);
        sc.close();
    }
}