package ua.lviv.iot.algo.part1.laptop2;

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

        this.batteryLife = capacityInHours;
        return this.batteryLife;
    }

}
