package org.example;

/**
 * Immutable parameter object used to carry order data for constructing a {@link CoffeeOrder}.
 *
 * Using an OrderInfo object improves readability and keeps constructors tidy when
 * there are multiple parameters (avoids telescoping constructors).
 */
public class OrderInfo {
    private final String customerName;
    private final int cups;
    private final double pricePerCup;
    private final boolean loyaltyMember;

    /**
     * Create a new OrderInfo instance.
     *
     * @param customerName  name of the customer (non-null recommended)
     * @param cups          number of cups ordered (must be >= 0)
     * @param pricePerCup   unit price per cup (must be >= 0)
     * @param loyaltyMember whether the customer is a loyalty program member
     */
    public OrderInfo(String customerName, int cups, double pricePerCup, boolean loyaltyMember) {
        if (cups < 0) throw new IllegalArgumentException("cups must be >= 0");
        if (pricePerCup < 0) throw new IllegalArgumentException("pricePerCup must be >= 0");
        this.customerName = customerName;
        this.cups = cups;
        this.pricePerCup = pricePerCup;
        this.loyaltyMember = loyaltyMember;
    }

    /**
     * @return the customer name
     */
    public String getCustomerName() { return customerName; }

    /**
     * @return number of cups ordered
     */
    public int getCups() { return cups; }

    /**
     * @return unit price per cup
     */
    public double getPricePerCup() { return pricePerCup; }

    /**
     * @return true if customer is a loyalty member, false otherwise
     */
    public boolean isLoyaltyMember() { return loyaltyMember; }
}
