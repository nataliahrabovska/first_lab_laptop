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

    public Ultrabook(String model, double screenSize, int ram, int storage, int batteryLife, int batteryLevel, double weightOfTheDevice, double deviceThickness) {
        super(model, screenSize, ram, storage, batteryLife, batteryLevel);
        this.weightOfTheDevice = weightOfTheDevice;
        this.deviceThickness = deviceThickness;
    }

    @Override
    public int replaceBattery(int capacityInHours) {
        this.batteryLife = capacityInHours;
        return batteryLife;
    }
}
