package com.dilshan.designPatterns.behavioral.observer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Youtube {
    public static void main(String[] args) {
        Channel channel = new Channel("SL Cricket");

        Subscriber slayer = new Subscriber("Slayer");
        Subscriber dimmu = new Subscriber("Dimmu");
        Subscriber testament = new Subscriber("Testament");
        Subscriber megadeth = new Subscriber("Megadeth");

        channel.subscribe(slayer);
        channel.subscribe(dimmu);
        channel.subscribe(testament);
        channel.subscribe(megadeth);

        slayer.subscribeChannel(channel);
        dimmu.subscribeChannel(channel);
        testament.subscribeChannel(channel);
        megadeth.subscribeChannel(channel);

        channel.upload("Cricket");
    }
}
