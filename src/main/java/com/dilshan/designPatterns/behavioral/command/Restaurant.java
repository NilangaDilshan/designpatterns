package com.dilshan.designPatterns.behavioral.command;

public class Restaurant {
    public static void main(String[] args) {
        Kitchen kitchen = new Kitchen();
        Waiter waiter = new Waiter();

        OrderCommand order1 = new OrderDishCommand(kitchen, "Pizza");
        OrderCommand order2 = new OrderDishCommand(kitchen, "Pasta");
        OrderCommand order3 = new OrderDishCommand(kitchen, "Rice");

        OrderCommand cancelOrder = new CancelDishCommand(kitchen, "Pizza");

        waiter.takeOrder(order1);
        waiter.takeOrder(order2);
        waiter.takeOrder(order3);
        waiter.takeOrder(cancelOrder);

        waiter.placeOrders();

    }
}
