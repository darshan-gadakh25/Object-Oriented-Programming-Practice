import java.util.LinkedList;
import java.util.Queue;

public class TicketBooking {
    public static void main(String[] args) {

        Queue<String> bookTicket = new LinkedList<>();
        bookTicket.offer("Amit");
        bookTicket.offer("Priya");
        bookTicket.offer("Rohan");

        System.out.println("Queue: " + bookTicket);

       
        String serving = bookTicket.poll();
        System.out.print("Serving: " + serving +",");
        System.out.print("Queue: " + bookTicket);

       

    }
}
