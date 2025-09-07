import java.util.*;

public class SortByFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        
        Integer[] arr = new Integer[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        
        Arrays.sort(arr, (a, b) -> freq.get(b) - freq.get(a));
        
        System.out.print("Sorted by frequency: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}