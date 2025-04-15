// Interface with calculate method
interface Billable {
    double calculate(); // to calculate total amount
}

// Product class implementing the interface
class Product implements Billable {
    private int productId;
    private String name;
    private int quantity;
    private double unitPrice;

    public Product(int id, String productName, int qty, double price) {
        productId = id;
        name = productName;
        quantity = qty;
        unitPrice = price;
    }

    // Implementation of calculate method from interface
    public double calculate() {
        return quantity * unitPrice;
    }

    // Method to display product details
    public void displayProduct() {
        System.out.printf("%-10d%-10s%-10d%-15.2f%-10.2f%n",
                          productId, name, quantity, unitPrice, calculate());
    }
}

// Main class
public class BillWithInterface {
    public static void main(String[] args) {
        Product product1 = new Product(101, "A", 2, 25.0);
        Product product2 = new Product(102, "B", 1, 100.0);

        double netAmount = product1.calculate() + product2.calculate();

        // Display the bill
        System.out.println("Order No.   Date :");
        System.out.println("Product Id  Name      Quantity   Unit Price     Total");
        product1.displayProduct();
        product2.displayProduct();
        System.out.printf("%-50s%-10.2f%n", "Net. Amount", netAmount);
    }
}

