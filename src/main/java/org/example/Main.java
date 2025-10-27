package org.example;

public class Main {
    public static void main(String[] args) {
        OrderInfo aisha = new OrderInfo("Aisha", 3, 4.50, true);
        OrderInfo budi = new OrderInfo("Budi", 2, 5.00, false);

        CoffeeOrder order1 = new CoffeeOrder(aisha);
        CoffeeOrder order2 = new CoffeeOrder(budi);

        OrderManagerT manager = new OrderManagerT();
        manager.addOrder(order1);
        manager.addOrder(order2);

        manager.printAllReceipts();
        manager.printReport();
    }
}
