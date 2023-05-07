package ua.lviv.iot.algo.part2.spring_lab6.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MacBook {
    private int id;
    private String color;
    private int guaranteeInMonth;
    private String model;
    private double screenSize;
    private int ram;
    private int storage;
    private int batteryLife;
    private int batteryLevel;
}
