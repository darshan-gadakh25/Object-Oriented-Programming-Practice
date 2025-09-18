import java.util.*;
import java.lang.*;
class Car implements Comparable<Car>{
	private int carId;
	private String carName;
	private  double carPrice;
	private int year;
	
	Car(int carId, String carName, double carPrice, int year){
		this.carId=carId;
		this.carName=carName;
		this.carPrice=carPrice;
		this.year=year;
	}
	
	public int getCarId(){
		return carId;
	}
	
	public void setCarId(int carId){
		this.carId=carId;
	}
	
	public String getCarName(){
		return carName;
	}
	
	public void setCarName(String carName){
		this.carName=carName;
	}
	
	public double getCarPrice(){
		return carPrice;
	}
	
	public void setCarPrice(double carPrice){
		this.carPrice=carPrice;
	}
	
	public int getYear(){
		return year;
	}
	
	public void setYear(int year){
		this.year=year;
	}
	
	@Override
	public int compareTo(Car c){
		int carp= Double.compare(this.carPrice, c.carPrice);
		if(carp == 0){
			return this.carName.compareTo(c.carName);
		}
		return carp;
	}
	
	@Override
    public String toString() {
        return "[CarId=" + carId + ", Name=" + carName + ", Price=" + carPrice + ", Year=" + year + "]";
    }
}


class SortByYear implements Comparator<Car>
{
	@Override
	public int compare(Car c1, Car c2){
		
		return Integer.compare(c1.getYear(), c2.getYear());
	}
}

class SortByName implements Comparator<Car>
{
	@Override
	public int compare(Car c1, Car c2){
			return c1.getCarName().compareTo(c2.getCarName());
		
	}
}
public class CarShowroom{
	
	public static void main(String [] args){
		Map<Integer, Car> carmap=new HashMap<>();
		
		Scanner sc=new Scanner(System.in);
		 String operation = "Yes";
		 
		 while( operation.equalsIgnoreCase("yes")){
			 showCarOperation();
			System.out.println("Enter number for proform operation:");
			int chioce=sc.nextInt();
			
			
			switch(chioce){
				case 1:
					System.out.println("Enter carId");
					int carId=sc.nextInt();
					System.out.println("Enter car name");
					String name=sc.next();
					System.out.println("Enter car price");
					double price=sc.nextDouble();
					System.out.println("Enter year");
					int year=sc.nextInt();
					
					carmap.put(carId,new Car(carId,name,price,year));
					break;
					
				case 2:
					System.out.println("Display car details:");
					for(Map.Entry<Integer, Car> entry : carmap.entrySet()){
						  System.out.println(entry.getValue());
					}
					break;
					
				case 3:
					System.out.println("Display car details bt price:");
					List<Car> list=new ArrayList<>(carmap.values());
					Collections.sort(list);
					for(Car c: list){
						 System.out.println(c);
					}
					break;
				case 4:
					List<Car> list1=new ArrayList<>(carmap.values());
					Collections.sort(list1, new SortByYear());
					for(Car c: list1){
						 System.out.println(c);
					}
					break;
				case 5:
				   operation="no";
				   break;
				   
				 default :
					System.out.println("Enter valid choice");
			}

		 }
		
	}
	private static void showCarOperation(){
		System.out.println("==============================================");
		System.out.println("1. add a new car");
		System.out.println("2.display All car");
		System.out.println("3.Display car sorted by price");
		System.out.println("4.Display car sorted by year");
		System.out.println("5.exit");
		System.out.println("==============================================");


		
		
	}
}