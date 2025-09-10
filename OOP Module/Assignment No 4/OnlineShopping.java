import java.util.Scanner;

public class OnlineShopping {
    
      public static void OrderProcess(int order, int quantity, double[] unitPrices, int index) {
        try {
            int totalPrice = (int) (unitPrices[order] * quantity) / quantity;
            double unitPriceAtIndex = unitPrices[index];

            System.out.println("Total Price: " + totalPrice);
            System.out.println("Unit Price at index " + index + ": " + unitPriceAtIndex);

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Exception");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the how many quariry of unit: ");
        int quantity = sc.nextInt();
        

        System.out.println("Enter the order");
        int count = sc.nextInt();

        System.out.println("Enter the index for getting unitprice: ");
        double[] unitPrices = new double[count];

        for (int i = 0; i < count; i++) {
            unitPrices[i] = sc.nextDouble();
        }

        System.out.println("Enter the index for getting unitprice: ");
        int index = sc.nextInt();
        OrderProcess(index, quantity, unitPrices, index);
    }
}
