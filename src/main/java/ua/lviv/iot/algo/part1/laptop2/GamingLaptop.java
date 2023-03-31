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

    public GamingLaptop(String model, double screenSize, int ram, int storage, int batteryLife, int batteryLevel, String graphicsProcessor, int fansForCooling) {
        super(model, screenSize, ram, storage, batteryLife, batteryLevel);
        this.graphicsProcessor = graphicsProcessor;
        this.fansForCooling = fansForCooling;
    }

    @Override
    public void replaceBattery(int capacityInHours) {

        this.batteryLife = capacityInHours;
    }

}
