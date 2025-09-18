import java.util.*;
import java.lang.*;

class Product{
	private String productName;
	private double price;
	private int staockQuantity;
	
	Product(String productName, double price, int staockQuantity){
		this.productName=productName;
		this.price=price;
		this.staockQuantity=staockQuantity;
	}
	
	public String getProductName(){
		return productName;
	}
	
	public void setProductName(String productName){
		this.productName=productName;
	}
	
	public double getPrice(){
		return price;
	}
	
	public void setPrice(double price){
		this.price=price;
	}
	
	public int getStockQuantity(){
		return staockQuantity;
	}
	
	public void setStockQuantity(int staockQuantity){
		this.staockQuantity=staockQuantity;
	}
}

class Store {
	List<Product> productList=new ArrayList<>();
	
	public void addProduct(Product p){
		productList.add(p);
	}
	
	public void purchaseProduct(String productName, int quantity) throws OutOfStockException {
		
		for(Product p : productList){
			if(p.getProductName().equalsIgnoreCase(productName)){
				if(  quantity > p.getStockQuantity()){
					throw new OutOfStockException("quantity of product are not available in stock.");
				}
				else{
					p.setStockQuantity(p.getStockQuantity() - quantity);
				}
				return;
			}
			
		}
		System.out.println("Product "+productName+" not in  store");
		
	}
	
	void displayProducts() {
		for(Product p: productList){
			System.out.println("ProductName: ["+p.getProductName()+"],Product Price: ["+p.getPrice()+"],Product quantity : ["+p.getStockQuantity()+"}");
		}
	}
	
}

class OutOfStockException extends Exception{
	OutOfStockException(String msg){
		super(msg);
	}
}
public class Main{
	public static  void main(String []  args) {
		try{
		Store st=new Store();
		st.addProduct(new Product("Bat",1500, 5));
		st.addProduct(new Product("Laptop",15000, 3));
		st.addProduct(new Product("Carrom",800, 10));
		
		System.out.println("Display all product:");
		st.displayProducts();
		
		System.out.println("Update product items:");
		st.purchaseProduct("Bat",2);
		
		System.out.println("Display all product after updating items:");
		st.displayProducts();
		}catch(OutOfStockException e){
			 System.out.println("Error: " + e.getMessage());
		}
	}
}