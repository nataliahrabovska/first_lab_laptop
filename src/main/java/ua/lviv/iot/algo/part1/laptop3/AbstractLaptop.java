package ua.lviv.iot.algo.part1.laptop3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@ToString
public abstract class AbstractLaptop {
    protected String model;
    protected double screenSize;
    protected int ram;
    protected int storage;
    protected int batteryLife;
    protected int batteryLevel;

    public abstract void replaceBattery(int capacityInHours);

    public AbstractLaptop() {
        model = "Unknown";
        screenSize = 15.6;
        ram = 8;
        storage = 256;
        batteryLife = 5;
        batteryLevel = 100;
    }

    public void addRam(int value) {
        ram += value;
    }

    public void addStorage(int value) {
        storage += value;
    }

    public void charge() {
        batteryLevel = 100;
    }

}
