import java.util.Scanner;

public class MoveNegatives {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int left = 0;
        
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                int temp = arr[i];
                arr[i] = arr[left];
                arr[left] = temp;
                left++;
            }
        }
        
        System.out.print("Array with negatives moved: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}