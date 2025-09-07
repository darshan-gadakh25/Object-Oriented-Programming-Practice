import java.util.Scanner;
import java.util.Arrays;

public class SecondSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);
        
        int secondSmallest = -1;
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[0]) {
                secondSmallest = arr[i];
                break;
            }
        }
        
        if (secondSmallest == -1) {
            System.out.println("No second smallest element");
        } else {
            System.out.println("Second smallest: " + secondSmallest);
        }
        sc.close();
    }
}