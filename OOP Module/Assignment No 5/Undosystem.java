import java.util.Stack;

public class Undosystem {
    public static void main(String[] args) {
        Stack<String> list=new Stack<>();
        list.add("Type A");
        list.add("Type b");
        list.add("Type C");
        // list.add("Type D");
        // list.add("Type E");

        System.out.println(list);
        System.out.println( "Operation: Undo last action");

     list.remove(list.size() -1);
     System.out.println("Current action" +list);
    }
}
