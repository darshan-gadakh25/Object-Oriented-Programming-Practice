import java.util.*;
import java.lang.*;

 class Room{
	private int roomId;
	private String roomType;
	private double price;
	private boolean isAvailable;
	
	Room(int roomId, String roomType, double price, boolean isAvailable ){
		this.roomId=roomId;
		this.roomType=roomType;
		this.price=price;
		this.isAvailable=isAvailable;
	}
	
	public int getRoomId(){
		return roomId;
	}
	
	public void setRoomId(int roomId){
		this.roomId=roomId;
	}
	
	public String getRoomType(){
		return roomType;
	}
	
	public void setRoomId(String roomType){
		this.roomType=roomType;
	}
	
	public double getPrice(){
		return price;
	}
	
	public void setRoomId(double price){
		this.price=price;
	}
	
	public boolean getIsAvailable(){
		return isAvailable;
	}
	
	public void setIsAvailable(boolean isAvailable){
		this.isAvailable=isAvailable;
	}

}

class LuxuryRoom  extends Room{
	private boolean isFoodInclude;
	
	LuxuryRoom(int roomId, String roomType, double price, boolean isAvailable,boolean isFoodInclude){
		super(roomId,roomType,price,isAvailable);
		this.isFoodInclude=isFoodInclude;
	}

	void displayDetails(){
		System.out.println("RoomId: "+getRoomId()+",RoomType: "+getRoomType()+",Room Price: "+getPrice()+",Room available: "+getIsAvailable()+"Food include: "+isFoodInclude);
	}
	
}
class EconomyRoom extends Room{
	private int roomSharingBet ;
	
	EconomyRoom(int roomId, String roomType, double price, boolean isAvailable,int roomSharingBet){
		super(roomId,roomType,price,isAvailable);
		this.roomSharingBet=roomSharingBet;
	}
	
	void displayDetails(){
		System.out.println("RoomId: "+getRoomId()+",RoomType: "+getRoomType()+",Room Price: "+getPrice()+",Room available: "+getIsAvailable()+"Room Sharing: "+roomSharingBet);
	}
}

class Customer {
	int customerId;
	String customerName;
	String customerEmail;
	
	Customer(int customerId, String customerName,  String customerEmail ){
		this.customerId=customerId;
		this.customerName=customerName;
		this.customerEmail=customerEmail;
	}
	
	void  bookRoom(){
		System.out.println("Room is Available");
	}
	 
	void cancelRoom(){
		System.out.println("Room is cancel");
	}
	
}

class RoomNotAvailableException extends Exception{
	RoomNotAvailableException(String msg){
		super(msg);
	}
}

class InvalidBookingException extends Exception{
	InvalidBookingException(String msg){
		super(msg);
	}
}

public class HotelBookingSystem{
	
	

	public static void main(String [] args){
	List<Room> manageRoom=new ArrayList<>();
		manageRoom.add(new Room(101,"Laxury" ,10000,false));
		manageRoom.add(new Room(102,"Economy" ,2000,false));
		manageRoom.add(new Room(103,"Laxury" ,18000,true));
		manageRoom.add(new Room(104,"Economy" ,3000,true));
		manageRoom.add(new Room(105,"Laxury" ,12000,true));
		
	List<Customer> managCustomer= new ArrayList<>();
	
		managCustomer.add(new Customer(111,"Darshan" ,"darshan&gmail.com"));
		managCustomer.add(new Customer(222,"Krushna" ,"krush&gmail.com"));
		managCustomer.add(new Customer(333,"Kunal" ,"kunal&gmail.com"));
		managCustomer.add(new Customer(444,"Karan" ,"karan&gmail.com"));
		managCustomer.add(new Customer(555,"Priya" ,"priya&gmail.com"));
		
	Map<Customer, Room> mapBooingRoom=new LinkedHashMap<>();
		mapBooingRoom.put(new Customer(111,"Darshan" ,"darshan&gmail.com"), new Room(101,"Laxury" ,10000,false));
		mapBooingRoom.put(new Customer(222,"Krushna" ,"krush&gmail.com"), new Room(102,"Economy" ,2000,false));
		mapBooingRoom.put(new Customer(333,"Kunal" ,"kunal&gmail.com"), new Room(103,"Laxury" ,18000,true));
		mapBooingRoom.put(new Customer(444,"Karan" ,"karan&gmail.com"), new Room(104,"Economy" ,3000,true));
		mapBooingRoom.put(new Customer(555,"Priya" ,"priya&gmail.com"), new Room(105,"Laxury" ,12000,true));

	System.out.println("Display All Room");
	for(Room r :manageRoom){
		System.out.println(r.getRoomId()+" , "+r.getRoomType());
	}
	
	System.out.println("Display All Room with allocated Customer");
	for(Map.Entry<Customer, Room> entry : mapBooingRoom.entrySet()){
		System.out.println(entry.getKey().customerName+" : "+entry.getValue().getRoomId());
	}
	}
}