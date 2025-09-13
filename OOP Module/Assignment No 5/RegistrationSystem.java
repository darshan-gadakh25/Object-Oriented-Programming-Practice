import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RegistrationSystem {
    
    public static void main(String[] args) {
        ArrayList<Integer> rollnoList= new ArrayList<>();
       

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Roll number: ");

        while (true) {
            int num=sc.nextInt();
            if(num == 0) break;
            rollnoList.add(num);
        }

        System.out.println("Roll Numbers: "+rollnoList);

         Set<Integer> rollNo=new HashSet<>(rollnoList);

         System.out.println("Unique Roll number: "+rollNo);
    }
}
