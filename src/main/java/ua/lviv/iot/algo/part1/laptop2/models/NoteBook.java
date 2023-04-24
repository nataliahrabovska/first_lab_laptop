package ua.lviv.iot.algo.part1.laptop2.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import ua.lviv.iot.algo.part1.laptop2.models.AbstractLaptop;

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

        this.setBatteryLife(capacityInHours);
        return this.getBatteryLife();
    }

    @Override
    public String getClassName() {
        return "NoteBook";
    }

    public String getHeaders() {
        return super.getHeaders() + ", " + "matrixType, ghz";
    }

    public String toCSV() {
        return super.toCSV() + matrixType + ", " + ghz;
    }
}