import java.util.Scanner;

public class MettingNotification {
    
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Base title:");
        String text1 = sc.nextLine();

        System.out.println("Enter Text to append: ");
        String text2=sc.nextLine();

        StringBuilder sb=new StringBuilder(text1);
        sb.append(" "+text2);

        System.out.println(sb);
    }
}
