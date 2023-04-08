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

    public NoteBook(String model, double screenSize, int ram, int storage, int batteryLife, int batteryLevel, String matrixType, int ghz) {
        super(model, screenSize, ram, storage, batteryLife, batteryLevel);
        this.matrixType = matrixType;
        this.ghz = ghz;
    }

    @Override
    public int replaceBattery(int capacityInHours) {
        this.batteryLife = capacityInHours;
        return capacityInHours;
    }
}