
public class TicketDemo{
    public static void main(String[] args){
        Ticket t1=new Ticket("Rahul");
        t1.displayTicket();
        
        Ticket t2=new Ticket("Priya");
        t2.displayTicket();
        
        Ticket t3=new Ticket("Amit");
          t3.displayTicket();
    }
}

class Ticket {
    String passengerName;
    static int ticketNo = 5000;
	
	Ticket( String passengerName){
	    this.passengerName=passengerName;
	    ticketNo++;
	}
	
	public void displayTicket(){
	      System.out.println("Ticket No: "+ticketNo+", Passenger: "+passengerName);
	}

}

/*

Ticket No: 5001, Passenger: Rahul
Ticket No: 5002, Passenger: Priya
Ticket No: 5003, Passenger: Amit

*/
