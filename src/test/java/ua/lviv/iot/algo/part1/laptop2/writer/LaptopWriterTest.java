package ua.lviv.iot.algo.part1.laptop2.writer;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import ua.lviv.iot.algo.part1.laptop2.models.*;

import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LaptopWriterTest {
    private String expectedFilePath = "src/test/resources/expected.csv";
    private String actualFilePath = "src/main/resources/ff.csv";
    private List<AbstractLaptop> laptopList = new LinkedList<>();

    @BeforeEach
    public void setup() {
        laptopList.add(new GamingLaptop("Victus", 15.6, 8, 512, 4, 99, "Nvidia  ", 2));
        laptopList.add(new GamingLaptop("Legion", 15.6, 16, 512, 5, 100, "AMD Ryzen", 2));
        laptopList.add(new Ultrabook("HP", 12.0, 16, 64, 3, 100, 1.2, 3));
        laptopList.add(new NoteBook("HP", 12.0, 16, 64, 3, 100, "Ips", 3));
        laptopList.add(new Ultrabook("Redmi", 13.0, 8, 128, 4, 75, 0.9, 4));
        laptopList.add(new MacBook("Air", 13.6, 8, 256, 4, 97, "grey", 12));
    }

    @Test
    public void testWriteToFile() throws IOException {
        try {
            LaptopWriter laptopWriter = new LaptopWriter();
            laptopWriter.writeToFile(laptopList);
            List<String> expectedLines = Files.readAllLines(Paths.get(expectedFilePath));
            List<String> actualLines = Files.readAllLines(Paths.get(actualFilePath));

            assertEquals(expectedLines, actualLines);
        } catch (Exception e) {
            new File("src/main/resources/ff.csv");
        }
    }
}
