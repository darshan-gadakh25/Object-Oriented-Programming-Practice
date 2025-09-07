import java.util.*;

public class CountDistinct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        Set<Integer> distinct = new HashSet<>();
        for (int num : arr) {
            distinct.add(num);
        }
        
        System.out.println("Distinct elements count: " + distinct.size());
        sc.close();
    }
}