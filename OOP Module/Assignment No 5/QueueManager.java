import java.util.LinkedList;
import java.util.Queue;

public class QueueManager {
    
    public static void main(String[] args) {
         Queue<String> queue = new LinkedList<>();
        queue.offer("is");
        queue.offer("pwd");
        queue.offer("cd");
        queue.offer("mkdir");
        queue.offer("main");

        System.out.println("Queue: " + queue);

       int historylimit= 3;
     while (queue.size() > historylimit) {
        String serving = queue.poll();
     }
        System.out.print("Queue: " + queue);

    }
}
