package ua.lviv.iot.algo.part1.laptop2.writer;

import ua.lviv.iot.algo.part1.laptop2.models.AbstractLaptop;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.List;
import java.util.stream.Collectors;

public class LaptopWriter {
    public void writeToFile(List<AbstractLaptop> laptopList) {
        if (laptopList.isEmpty()) {
            return;
        }
        List<AbstractLaptop> sortedList = laptopList.stream()
                .sorted((o1, o2) -> o1.getClass().getSimpleName().compareTo(o2.getClass().getSimpleName()))
                .collect(Collectors.toList());
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/main/resources/ff.csv"))) {
            String lastClassName = "";
            for (AbstractLaptop laptop : sortedList) {
                if (!laptop.getClass().getSimpleName().equals(lastClassName)) {
                    writer.write(laptop.getHeaders());
                    writer.write("\n");
                    lastClassName = laptop.getClass().getSimpleName();
                }
                writer.write(laptop.toCSV());
                writer.write("\n");
            }
        } catch (Exception e) {
            new File("src/main/resources/ff.csv");
        }
    }
}