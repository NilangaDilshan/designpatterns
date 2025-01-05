package com.dilshan.designPatterns.latest.solid.openclosed;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PhoneSubscriber extends Subscriber {

    @Override
    //Open for extension
    public double calculateBill() {
        return baseRate * 1.2;
    }
}
