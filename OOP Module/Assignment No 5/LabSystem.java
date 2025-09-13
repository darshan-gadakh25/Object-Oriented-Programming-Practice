import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class LabSystem {
    
    public static void main(String[] args) {
        
        Deque<String> qu=new LinkedList<>();
        qu.offer("Amit");
        qu.offer("Priya");
        qu.offer("Rohan");

        System.out.println(qu);

        qu.removeFirst();

        System.out.println(qu);
    }
}
