import java.util.*;

public class SymmetricPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of pairs: ");
        int n = sc.nextInt();
        
        int[][] pairs = new int[n][2];
        System.out.println("Enter pairs:");
        for (int i = 0; i < n; i++) {
            pairs[i][0] = sc.nextInt();
            pairs[i][1] = sc.nextInt();
        }
        
        Set<String> seen = new HashSet<>();
        System.out.println("Symmetric pairs:");
        
        for (int i = 0; i < n; i++) {
            String reverse = pairs[i][1] + "," + pairs[i][0];
            if (seen.contains(reverse)) {
                System.out.println("(" + pairs[i][1] + "," + pairs[i][0] + ") and (" + pairs[i][0] + "," + pairs[i][1] + ")");
            }
            seen.add(pairs[i][0] + "," + pairs[i][1]);
        }
        sc.close();
    }
}