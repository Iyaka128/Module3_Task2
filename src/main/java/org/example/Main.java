package org.example;

/**
 * Small demo entry point that constructs an {@link OrderInfo}, creates a {@link CoffeeOrder}
 * and prints a receipt. This class demonstrates usage of the domain classes.
 */
public class Main {
    /**
     * Program entry point.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        // Use OrderInfo parameter object for clarity
        OrderInfo info = new OrderInfo("Aisha", 3, 4.50, true);
        CoffeeOrder order = new CoffeeOrder(info);

        order.printReceipt();
    }
}
