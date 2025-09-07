import java.util.*;

public class RearrangeAlternate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();
        
        for (int num : arr) {
            if (num >= 0) {
                positive.add(num);
            } else {
                negative.add(num);
            }
        }
        
        int i = 0, p = 0, n1 = 0;
        
        while (p < positive.size() && n1 < negative.size()) {
            arr[i++] = positive.get(p++);
            arr[i++] = negative.get(n1++);
        }
        
        while (p < positive.size()) {
            arr[i++] = positive.get(p++);
        }
        
        while (n1 < negative.size()) {
            arr[i++] = negative.get(n1++);
        }
        
        System.out.print("Rearranged array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}