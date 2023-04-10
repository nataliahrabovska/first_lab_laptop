package ua.lviv.iot.algo.part1.laptop2;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@ToString(callSuper = true)

public class NoteBook extends AbstractLaptop {
    private String matrixType;
    private int ghz;

    public NoteBook(final String model, final double screenSize, final int ram, final int storage, final int batteryLife, final int batteryLevel, final String matrixType, final int ghz) {
        super(model, screenSize, ram, storage, batteryLife, batteryLevel);
        this.matrixType = matrixType;
        this.ghz = ghz;
    }

    @Override
    public int replaceBattery(final int capacityInHours) {
        this.batteryLife = capacityInHours;
        return capacityInHours;
    }
}