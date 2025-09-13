import java.util.LinkedList;
import java.util.List;

public class DailyTask {
    
    public static void main(String[] args) {
        List <String> list=new LinkedList<>();
        list.add("Study Java");
        list.add("Complete Assignment");
        list.add("Exercise");

        System.out.println("add task: "+list);
        System.out.println("Completerd task: " +"Exercise");

        list.remove("Exercise");

        System.out.println("Remaining Task: "+list);

    }
}
