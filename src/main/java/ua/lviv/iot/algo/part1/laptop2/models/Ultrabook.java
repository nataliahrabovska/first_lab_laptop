package ua.lviv.iot.algo.part1.laptop2.models;

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
    private int deviceThickness;

    public Ultrabook(final String model, final double screenSize, final int ram, final int storage, final int batteryLife, final int batteryLevel, final double weightOfTheDevice, final double deviceThickness) {
        super(model, screenSize, ram, storage, batteryLife, batteryLevel);
        this.weightOfTheDevice = weightOfTheDevice;
        this.deviceThickness = (int) deviceThickness;
    }

    @Override
    public int replaceBattery(final int capacityInHours) {

        this.setBatteryLife(capacityInHours);
        return this.getBatteryLife();
    }

    @Override
    public String getClassName() {
        return "Ultrabook";
    }

    public String getHeaders() {
        return super.getHeaders() + ", " + "weightOfTheDevice, deviceThickness";
    }

    public String toCSV() {
        return super.toCSV() + weightOfTheDevice + ", " + deviceThickness;
    }
}
