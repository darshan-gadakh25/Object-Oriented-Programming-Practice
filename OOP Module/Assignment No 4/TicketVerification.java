import java.util.Scanner;

public class TicketVerification {

    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=sc.nextLine();

        StringBuffer sb=new StringBuffer(str);

        System.out.println("Reverse String");
        System.out.println(sb.reverse());
    }
}