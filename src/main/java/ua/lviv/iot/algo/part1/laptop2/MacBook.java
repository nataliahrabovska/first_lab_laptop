package ua.lviv.iot.algo.part1.laptop2;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@ToString(callSuper = true)

public class MacBook extends AbstractLaptop {
    private String color;
    private int guaranteeInMonth;

    public MacBook(String model, double screenSize, int ram, int storage, int batteryLife, int batteryLevel, String color, int guarantee) {
        super(model, screenSize, ram, storage, batteryLife, batteryLevel);
        this.color = color;
        this.guaranteeInMonth = guarantee;
    }

    @Override
    public void replaceBattery(int capacityInHours) {
        this.batteryLife = capacityInHours;
    }

}
