
import java.util.*;
import java.lang.*;
interface VehicalFeature{
	
	public void startEngine();
	public void stopEngine();
}

abstract class Vehical{
	private String brand;
	private int year;
	
	Vehical(String brand, int year){
		this.brand=brand;
		this.year=year;
	}
	
	public String getBrand(){
		return brand;
	}
	
	public void setBrand(String brand){
		this.brand=brand;
	}
	
	public int getYear(){
		return year;
	}
	
	public void setYear(int year){
		this.year=year;
	}
	
	abstract void displayDetails();
}

class Car extends Vehical{
	private String model;
	
	Car(String brand, int year, String model){
		super(brand, year);
		this.model=model;
	}
	
	public String getModel(){
		return model;
	}
	
	public void setModel(String model){
		this.model=model;
	}
	
	@Override
	void displayDetails(){
		System.out.println("brand: "+getBrand()+"\n year: "+getYear()+"\n model: "+model);
	}
}

class ElectricCar extends Car implements VehicalFeature{
	
	private int batteryCapacty;
	
	ElectricCar(String brand, int year, String model,int batteryCapacty){
		super(brand, year, model);
		this.batteryCapacty=batteryCapacty;
	}
	
	@Override
	void displayDetails(){
		System.out.println("brand: "+getBrand()+"\n year: "+getYear()+"\n model: "+getModel()+"\n Battery Capacity: "+batteryCapacty+" kWh");
	}
	
	@Override
	public void startEngine(){
		System.out.println("Electric engine started.");
	}
	
	@Override
	public void stopEngine(){
		System.out.println("Electric engine stopped.");
	}
	
}
public class VehicalManagemnet{
	
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		String brand=sc.next();
		
		int year=sc.nextInt();
		
		String model=sc.next();
		
		int batteryCapacty=sc.nextInt();
		
		ElectricCar obj=new ElectricCar(brand,year,model, batteryCapacty);
		obj.displayDetails();
		obj.startEngine();
		obj.stopEngine();
	}
}