package com.dilshan.designPatterns.creational.builder;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Phone {
    private String os;
    private String processor;
    private double screenSize;
    private int battery;
    private int camera;

    private Phone(Builder builder) {
        this.os = builder.os;
        this.processor = builder.processor;
        this.screenSize = builder.screenSize;
        this.battery = builder.battery;
        this.camera = builder.camera;
    }

    public String getOs() {
        return os;
    }

    public String getProcessor() {
        return processor;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public int getBattery() {
        return battery;
    }

    public int getCamera() {
        return camera;
    }

    public static class Builder {
        private String os;
        private String processor = "Snapdragon";
        private double screenSize = 6.6;
        private int battery = 1;
        private int camera = 2;

        public Builder os(String os) {
            this.os = os;
            return this;
        }

        public Builder processor(String processor) {
            this.processor = processor;
            return this;
        }

        public Builder screenSize(double screenSize) {
            this.screenSize = screenSize;
            return this;
        }

        public Builder battery(int battery) {
            this.battery = battery;
            return this;
        }

        public Builder camera(int camera) {
            this.camera = camera;
            return this;
        }

        public Phone build() {
            return new Phone(this);
        }
    }
}

