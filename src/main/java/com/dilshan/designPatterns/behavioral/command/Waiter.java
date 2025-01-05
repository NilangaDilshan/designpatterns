package com.dilshan.designPatterns.behavioral.command;

import java.util.LinkedList;
import java.util.Queue;

public class Waiter {
    private final Queue<OrderCommand> orders = new LinkedList<>();

    public void takeOrder(OrderCommand order) {
        this.orders.offer(order);
    }

    public void placeOrders() {
        while (!orders.isEmpty()) {
            OrderCommand order = orders.poll();
            order.execute();
        }
    }
}
