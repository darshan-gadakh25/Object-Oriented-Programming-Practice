import java.util.Scanner;

public class AcadamicSystem {
    
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
        System.out.println("Enter Original text:");
        String text1 = sc.nextLine();

        System.out.println("Enter the text that remoing in given text:");
        String text2=sc.nextLine();

        StringBuffer sb=new StringBuffer(text1);

        int start = sb.indexOf(text2);

        int end = start +text2.length();

       sb= sb.delete(start, end);
        System.out.println(sb);
    }
}
