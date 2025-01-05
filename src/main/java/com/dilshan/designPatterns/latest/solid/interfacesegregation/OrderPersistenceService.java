package com.dilshan.designPatterns.latest.solid.interfacesegregation;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class OrderPersistenceService implements PersistenceService<Order> {

    private static final Map<Long, Order> ORDERS = new ConcurrentHashMap<>();

    @Override
    public void save(Order entity) {
        ORDERS.put(entity.getId(), entity);
    }

    @Override
    public void delete(Order entity) {
        ORDERS.remove(entity.getId());
    }

    @Override
    public Order findById(Long id) {
        return ORDERS.get(id);
    }

}
