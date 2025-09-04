import java.util.Scanner;
public class OldestYoungest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

         System.out.print("Enter age of Friend 1: ");
        int f1 = sc.nextInt();
        System.out.print("Enter age of Friend 2: ");
        int f2 = sc.nextInt();
        System.out.print("Enter age of Friend 3: ");
        int f3 = sc.nextInt();

        int oldest, youngest;
        String oldName, youngName;

        if (f1 >= f2 && f1 >= f3) {
            oldest = f1;
            oldName = "Friend 1";
        } else if (f2 >= f1 && f2 >= f3) {
            oldest = f2;
            oldName = "Friend 2";
        } else {
            oldest = f3;
            oldName = "Friend 3";
        }

        if (f1 <= f2 && f1 <= f3) {
            youngest = f1;
            youngName = "Friend 1";
        } else if (f2 <= f1 && f2 <= f3) {
            youngest = f2;
            youngName = "Friend 2";
        } else {
            youngest = f3;
            youngName = "Friend 3";
        }

        System.out.println("Oldest: " + oldName);
        System.out.println("Youngest: " + youngName);
    }
}

/* 
OUTPUT

  java OldestYoungest
Enter age of Friend 1: 22
Enter age of Friend 2: 25
Enter age of Friend 3: 20
Oldest: Friend 2
Youngest: Friend 3


*/