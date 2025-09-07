import java.util.*;

public class CommonElements3Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int[] arr3 = new int[n];
        
        System.out.println("Enter first array:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        
        System.out.println("Enter second array:");
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        
        System.out.println("Enter third array:");
        for (int i = 0; i < n; i++) {
            arr3[i] = sc.nextInt();
        }
        
        int i = 0, j = 0, k = 0;
        System.out.print("Common elements: ");
        
        while (i < n && j < n && k < n) {
            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
                k++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr3[k]) {
                j++;
            } else {
                k++;
            }
        }
        sc.close();
    }
}