package com.dilshan.designPatterns.latest.solid.openclosed;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//Closed for modification
public abstract class Subscriber {

    protected Long subscriberId;
    protected String address;
    protected Long phoneNumber;
    protected int baseRate;

    public abstract double calculateBill();
}
