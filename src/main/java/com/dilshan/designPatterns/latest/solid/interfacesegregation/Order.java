package com.dilshan.designPatterns.latest.solid.interfacesegregation;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Order extends Entity{

    private LocalDateTime orderPlacedOn;
    private double totalValue;

    public Order(Long id, LocalDateTime orderPlacedOn, double totalValue) {
        super(id);
        this.orderPlacedOn = orderPlacedOn;
        this.totalValue = totalValue;
    }
}
