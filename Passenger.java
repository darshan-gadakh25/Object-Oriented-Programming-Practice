
public class Passenger {
	String name;
	int age;
	String seatType ="General";
	static int totalPassangers;
	
	Passenger(String name, int age) {
		this.name = name;
		this.age = age;
		totalPassangers++;
	}

	Passenger(String name, int age, String seatType) {
		this.name = name;
		this.age = age;
		this.seatType = seatType;
		totalPassangers++;
		
	}

	String getName() {
		return name;
	}
	
	int getAge() {
		return age;
	}

	String getSeatType() {
		return seatType;
	}

	static void getTotalPassangers() {
		System.out.println("Total Passengers Booked: "+totalPassangers);
	}
	
	
	public static void main(String[] args) {
		
		Passenger p1=new Passenger("Ravi",25);
		Passenger p2=new Passenger("Anita",30,"AC Sleeper");
		Passenger p3=new Passenger("Suresh",40);
		
		System.out.println("Passenger1 Name:"+p1.getName()+" Age: "+p1.getAge()+" Seat: "+p1.getSeatType());
		System.out.println("Passenger2 Name:"+p2.getName()+" Age: "+p2.getAge()+" Seat: "+p2.getSeatType());
		System.out.println("Passenger3 Name:"+p3.getName()+" Age: "+p3.getAge()+" Seat: "+p3.getSeatType());

		getTotalPassangers();
	}
}
