package org.example;

/**
 * Represents a coffee order placed by a customer.
 *
 * This class demonstrates encapsulation (private fields and public getters),
 * using a parameter object {@link OrderInfo} in the constructor, avoiding magic numbers
 * by extracting them to named constants, and small helper methods for readability.
 *
 * Implements {@link Purchasable} so it can be used wherever final price calculation is needed.
 */
public class CoffeeOrder implements Purchasable {
    // Encapsulated fields
    private String customerName;
    private int cups;
    private double pricePerCup;
    private boolean loyaltyMember;

    // Named constants instead of raw "magic" numbers.
    /** Discount rate applied to loyalty members (10% = 0.10). */
    public static final double DISCOUNT_RATE = 0.10;
    /** Tax rate applied to the order after discounts (7% = 0.07). */
    public static final double TAX_RATE = 0.07;

    /**
     * Construct a CoffeeOrder from an {@link OrderInfo} parameter object.
     * Using a parameter object improves clarity for constructors with multiple parameters.
     *
     * @param info the {@link OrderInfo} containing order details
     * @throws IllegalArgumentException if info is null
     */
    public CoffeeOrder(OrderInfo info) {
        if (info == null) throw new IllegalArgumentException("OrderInfo must not be null");
        this.customerName = info.getCustomerName();
        this.cups = info.getCups();
        this.pricePerCup = info.getPricePerCup();
        this.loyaltyMember = info.isLoyaltyMember();
    }

    // Getters (encapsulation)

    /**
     * @return the customer name for this order
     */
    public String getCustomerName() { return customerName; }

    /**
     * @return number of cups ordered
     */
    public int getCups() { return cups; }

    /**
     * @return price per cup in the same currency units used by this application
     */
    public double getPricePerCup() { return pricePerCup; }

    /**
     * @return true if the customer is a loyalty member (eligible for discount)
     */
    public boolean isLoyaltyMember() { return loyaltyMember; }

    // Extracted method(s) for clarity

    /**
     * Calculate the subtotal (quantity * unit price) before discounts and taxes.
     *
     * @return subtotal amount
     */
    public double calculateSubtotal() {
        return cups * pricePerCup;
    }

    /**
     * Calculate the discount amount. Only loyalty members receive discount.
     *
     * @return discount amount (0.0 if not a loyalty member)
     */
    public double calculateDiscountAmount() {
        if (!loyaltyMember) return 0.0;
        return calculateSubtotal() * DISCOUNT_RATE;
    }

    /**
     * {@inheritDoc}
     *
     * Calculates the final price by:
     * 1. computing the subtotal,
     * 2. subtracting any discount,
     * 3. applying tax to the discounted subtotal.
     *
     * @return final price including tax and after discount
     */
    @Override
    public double getFinalPrice() {
        // local variable to hold subtotal after discount (keeps expression readable)
        double subtotalAfterDiscount = calculateSubtotal() - calculateDiscountAmount();
        return subtotalAfterDiscount + (subtotalAfterDiscount * TAX_RATE);
    }

    /**
     * Print a simple receipt to {@link System#out} with order details and amounts.
     * This method is primarily for demonstration and small CLI apps.
     */
    public void printReceipt() {
        System.out.println("Customer: " + getCustomerName());
        System.out.println("Cups: " + getCups());
        System.out.printf("Price per cup: $%.2f%n", getPricePerCup());
        System.out.printf("Subtotal: $%.2f%n", calculateSubtotal());
        System.out.printf("Discount: $%.2f%n", calculateDiscountAmount());
        System.out.printf("Total (incl. tax): $%.2f%n", getFinalPrice());
    }
}
