import java.util.Scanner;
import java.util.Stack;

public class HistroyManagement {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Stack<String> list=new Stack<>();
        System.out.println("Enter history: ");
        while(true){
            String history=sc.next();
            if(history.equalsIgnoreCase("done")) break;

            list.add(history);
        }

         System.out.println("Enter Action: ");
         int actionPage = sc.nextInt();
        
         System.out.println("size of stack: "+list.size());
         while ( actionPage > 0 ) {
            list.remove(list.size() - 1);
            actionPage--;
         }

         System.out.println("Current Action:"+list);
    }
}
