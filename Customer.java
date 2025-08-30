
public class Customer {
	
	String name;
	String ticketType = "Normal";
	static int soldTicket;
	
	Customer(String name) {
		this.name = name;
		soldTicket++;
	}

	Customer(String name, String ticketType) {
		this.name = name;
		this.ticketType = ticketType;
		soldTicket++;
	}

	public String getName() {
		return name;
	}

	public String getTicketType() {
		return ticketType;
	}
	
	public static int getSoldTicket() {
		return soldTicket;
	}
	
	
	public static void main(String[] args) {
		
		Customer c1=new Customer("Rahul");
		Customer c2=new Customer("Pooja","Premium");
		Customer c3=new Customer("Amit");
		
		System.out.println("Customer1: Name: "+c1.getName()+" Ticket: "+c1.getTicketType());
		System.out.println("Customer2: Name: "+c2.getName()+" Ticket: "+c2.getTicketType());
		System.out.println("Customer3: Name: "+c3.getName()+" Ticket: "+c3.getTicketType());
		System.out.println("Total Ticket Sold: "+getSoldTicket());
	}
	
	
	
	
}

/*

OUTPUT

Customer1: Name: Rahul Ticket: Normal
Customer2: Name: Pooja Ticket: Premium
Customer3: Name: Amit Ticket: Normal
Total Ticket Sold: 3

*/
