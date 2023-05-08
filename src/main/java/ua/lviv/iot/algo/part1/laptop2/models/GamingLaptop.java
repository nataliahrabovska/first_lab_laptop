package ua.lviv.iot.algo.part1.laptop2.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@ToString(callSuper = true)

public class GamingLaptop extends AbstractLaptop {
    private String graphicsProcessor;
    private int fansForCooling;

    public GamingLaptop(final String model, final double screenSize, final int ram, final int storage, final int batteryLife, final int batteryLevel, final String graphicsProcessor, final int fansForCooling) {
        super(model, screenSize, ram, storage, batteryLife, batteryLevel);
        this.graphicsProcessor = graphicsProcessor;
        this.fansForCooling = fansForCooling;
    }

    @Override
    public int replaceBattery(final int capacityInHours) {

        this.setBatteryLife(capacityInHours);
        return this.getBatteryLife();
    }

    @Override
    public String getClassName() {
        return "GamingLaptop";
    }

    public String getHeaders() {
        return super.getHeaders() + ", " + "graphicsProcessor, fansForCooling";
    }

    public String toCSV() {
        return super.toCSV() + graphicsProcessor + ", " + fansForCooling;
    }
}
