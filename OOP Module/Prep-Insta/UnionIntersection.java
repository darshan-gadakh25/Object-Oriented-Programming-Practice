import java.util.*;

public class UnionIntersection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first array size: ");
        int n1 = sc.nextInt();
        
        int[] arr1 = new int[n1];
        System.out.println("Enter first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        
        System.out.print("Enter second array size: ");
        int n2 = sc.nextInt();
        
        int[] arr2 = new int[n2];
        System.out.println("Enter second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        
        Set<Integer> union = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();
        Set<Integer> set1 = new HashSet<>();
        
        for (int num : arr1) {
            union.add(num);
            set1.add(num);
        }
        
        for (int num : arr2) {
            union.add(num);
            if (set1.contains(num)) {
                intersection.add(num);
            }
        }
        
        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);
        sc.close();
    }
}