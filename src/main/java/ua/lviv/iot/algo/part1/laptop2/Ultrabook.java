package ua.lviv.iot.algo.part1.laptop2;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@ToString(callSuper = true)

public class Ultrabook extends AbstractLaptop {
    private double weightOfTheDevice;
    private double deviceThickness;

    public Ultrabook(final String model, final double screenSize, final int ram, final int storage, final int batteryLife, final int batteryLevel, final double weightOfTheDevice, final double deviceThickness) {
        super(model, screenSize, ram, storage, batteryLife, batteryLevel);
        this.weightOfTheDevice = weightOfTheDevice;
        this.deviceThickness = deviceThickness;
    }

    @Override
    public int replaceBattery(final int capacityInHours) {
        this.batteryLife = capacityInHours;
        return batteryLife;
    }
}
