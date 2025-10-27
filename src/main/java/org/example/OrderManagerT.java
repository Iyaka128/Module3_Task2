package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * OrderManager class
 * Menyimpan dan menghitung total dari beberapa CoffeeOrder.
 */
public class OrderManagerT {
    private List<CoffeeOrder> orders = new ArrayList<>();

    /** Menambahkan order baru */
    public void addOrder(CoffeeOrder order) {
        orders.add(order);
    }

    /** Menampilkan semua struk */
    public void printAllReceipts() {
        System.out.println("=== ALL RECEIPTS ===");
        for (CoffeeOrder order : orders) {
            order.printReceipt();
            System.out.println("---------------------");
        }
    }

    /** Menghitung total seluruh pendapatan */
    public double getTotalRevenue() {
        double total = 0;
        for (CoffeeOrder order : orders) {
            total += order.getFinalPrice();
        }
        return total;
    }

    public static void main(String[] args) {
        OrderManagerT orderManagerT = new OrderManagerT();
    }

    /** Menampilkan ringkasan laporan */
    public void printReport() {
        System.out.println("=== ORDER REPORT ===");
        System.out.println("Total orders: " + orders.size());
        System.out.printf("Total revenue: $%.2f%n", getTotalRevenue());
        System.out.println("====================");
    }

}
