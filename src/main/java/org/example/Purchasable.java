package org.example;

/**
 * Represents an object that can be purchased and therefore can provide
 * a final price (including discounts, taxes, or other adjustments).
 *
 * Implementing classes must provide an implementation for {@link #getFinalPrice()}.
 */
public interface Purchasable {
    /**
     * Calculate and return the final price for this purchasable object.
     * The returned value should already include any discounts, taxes, or fees.
     *
     * @return the final price as a double (currency units)
     */
    double getFinalPrice();
}
