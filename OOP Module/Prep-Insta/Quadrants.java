import java.util.Scanner;

public class Quadrants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x and y coordinates: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        if (x > 0 && y > 0) {
            System.out.println("Point lies in Quadrant I");
        } else if (x < 0 && y > 0) {
            System.out.println("Point lies in Quadrant II");
        } else if (x < 0 && y < 0) {
            System.out.println("Point lies in Quadrant III");
        } else if (x > 0 && y < 0) {
            System.out.println("Point lies in Quadrant IV");
        } else if (x == 0 && y != 0) {
            System.out.println("Point lies on Y-axis");
        } else if (y == 0 && x != 0) {
            System.out.println("Point lies on X-axis");
        } else {
            System.out.println("Point is at origin");
        }
        sc.close();
    }
}