import java.util.Scanner;

public class FacultityManagemenet {
    public static void main(String[] args) {
          Scanner sc= new Scanner(System.in);
        System.out.println("Enter Original text:");
        String text1 = sc.nextLine();

        System.out.println("Enter Text to insert: ");
        String text2=sc.nextLine();

        StringBuffer sb=new StringBuffer(text1);
         sb.insert(0,text2 +" ");
         System.out.println(sb);
    }
}
