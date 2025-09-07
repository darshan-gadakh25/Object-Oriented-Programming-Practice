import java.util.*;

public class SubsetSums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        List<Integer> sums = new ArrayList<>();
        generateSubsetSums(arr, 0, 0, sums);
        
        System.out.println("Subset sums: " + sums);
        sc.close();
    }
    
    static void generateSubsetSums(int[] arr, int index, int sum, List<Integer> sums) {
        if (index == arr.length) {
            sums.add(sum);
            return;
        }
        
        generateSubsetSums(arr, index + 1, sum, sums);
        generateSubsetSums(arr, index + 1, sum + arr[index], sums);
    }
}