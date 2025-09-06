import java.util.ArrayList;
import java.util.List;

class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

abstract class CartItem {
    abstract double calculateTotalPrice();
}

interface Discountable {
    void applyDiscount(double percentage);
}

class Cart extends CartItem implements Discountable {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    double calculateTotalPrice() {
        double total = 0;
        for (Product p : products) {
            total += p.getPrice();
        }
        return total;
    }

    @Override
    public void applyDiscount(double percentage) {
        if (!products.isEmpty()) {
            Product p = products.get(0); 
            double discountedPrice = p.getPrice() - (p.getPrice() * percentage / 100);
            p.setPrice(discountedPrice);
            System.out.println("Applying " + percentage + "% discount to " + p.getName());
        }
    }
}

public class ShoppingCartSystem {
    public static void main(String[] args) {
        Product p1 = new Product(1, "Laptop", 50000);
        Product p2 = new Product(2, "Mouse", 500);
        Product p3 = new Product(3, "Keyboard", 1200);

        Cart cart = new Cart();
        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.addProduct(p3);
        cart.applyDiscount(10); 

        System.out.println("Total Cart Price = " + cart.calculateTotalPrice());
    }
}