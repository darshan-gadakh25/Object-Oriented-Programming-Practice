import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class HistoryTracker {
    
    public static void main(String[] args) {
        Queue<String> q=new LinkedList<>();
        q.offer("job");
        q.offer("pwd");
        q.offer("cd..");
        q.offer("ls");
        // q.offer("mkdir");

        while (q.size() > 3) {
            q.poll();
        }

        Iterator<String> it=q.iterator();

        System.out.print("Recent Commands: ");
        while (it.hasNext()) {
            System.out.print(it.next());
            if(it.hasNext()){
                System.out.print(", ");
            }
        }
    }
}
