package ua.lviv.iot.algo.part1.laptop2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@ToString
public abstract class AbstractLaptop {
    private String model;
    private double screenSize;
    private int ram;
    private int storage;
    private int batteryLife;
    private int batteryLevel;

    public abstract int replaceBattery(int capacityInHours);

    public AbstractLaptop() {
        model = "Unknown";
        screenSize = 15.6;
        ram = 8;
        storage = 256;
        batteryLife = 5;
        batteryLevel = 100;
    }

    public void addRam(final int value) {
        ram += value;
    }

    public void addStorage(final int value) {
        storage += value;
    }

    public void charge() {
        batteryLevel = 100;
    }

}
