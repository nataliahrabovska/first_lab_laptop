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

    public MacBook(final String model, final double screenSize, final int ram, final int storage, final int batteryLife, final int batteryLevel, final String color, final int guarantee) {
        super(model, screenSize, ram, storage, batteryLife, batteryLevel);
        this.color = color;
        this.guaranteeInMonth = guarantee;
    }

    @Override
    public int replaceBattery(final int capacityInHours) {
        this.batteryLife = capacityInHours;
        return batteryLife;
    }

}
