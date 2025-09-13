import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class DataFilter {
    public static void main(String[] args) {
        List<Integer> rollNumber=new ArrayList<>();

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter roll number: ");
        while (true) {
           
            int rollNo= sc.nextInt();

           if(rollNo == 0) 
            break;

            rollNumber.add(rollNo);
        }

        Iterator<Integer> list= rollNumber.iterator();
        System.out.print("Even roll Numbers: ");
        while (list.hasNext()) {
           int num= list.next();
           if(num % 2 == 0){
            System.out.print( num +",");
           }
        }
    }
}
