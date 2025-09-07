import java.util.Scanner;

public class MedianTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first array size: ");
        int n1 = sc.nextInt();
        
        int[] arr1 = new int[n1];
        System.out.println("Enter first sorted array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        
        System.out.print("Enter second array size: ");
        int n2 = sc.nextInt();
        
        int[] arr2 = new int[n2];
        System.out.println("Enter second sorted array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        
        int[] merged = new int[n1 + n2];
        int i = 0, j = 0, k = 0;
        
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }
        
        while (i < n1) merged[k++] = arr1[i++];
        while (j < n2) merged[k++] = arr2[j++];
        
        int total = n1 + n2;
        double median;
        
        if (total % 2 == 0) {
            median = (merged[total / 2 - 1] + merged[total / 2]) / 2.0;
        } else {
            median = merged[total / 2];
        }
        
        System.out.println("Median: " + median);
        sc.close();
    }
}