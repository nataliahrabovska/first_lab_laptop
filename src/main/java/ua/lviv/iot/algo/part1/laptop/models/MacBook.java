package ua.lviv.iot.algo.part1.laptop.models;

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
    private Integer id;

    public MacBook(final String model, final double screenSize, final int ram, final int storage, final int batteryLife, final int batteryLevel, final String color, final int guarantee) {
        super(model, screenSize, ram, storage, batteryLife, batteryLevel);
        this.color = color;
        this.guaranteeInMonth = guarantee;
    }

    @Override
    public int replaceBattery(final int capacityInHours) {

        this.setBatteryLife(capacityInHours);
        return this.getBatteryLife();
    }

    @Override
    public String getClassName() {
        return "MacBook";
    }

    public String getHeaders() {
        return super.getHeaders() + ", " + "color, guaranteeInMonth";
    }

    public String toCSV() {
        return super.toCSV() + color + ", " + guaranteeInMonth;
    }

}
