package com.dilshan.designPatterns.latest.solid.openclosed;

import lombok.*;

@Getter
@Setter
public class IspSubscriber extends Subscriber {

    @Override
    //Open for extension
    public double calculateBill() {
        return baseRate * 1.5;
    }
}
