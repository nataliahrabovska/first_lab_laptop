package ua.lviv.iot.algo.part1.laptop2.models;

import org.junit.jupiter.api.Test;
import ua.lviv.iot.algo.part1.laptop2.models.MacBook;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MacBookTest {
    @Test
    public void testReplaceBattery(){
        var macBook = new MacBook();
        assertEquals(100,macBook.replaceBattery(100));
    }
    @Test
    void getHeaders_ReturnsCorrectString() {
        MacBook laptop = new MacBook();
        assertEquals("model, screenSize, ram, storage, batteryLife, batteryLevel, color, guaranteeInMonth", laptop.getHeaders());
    }

    @Test
    void toCSV_ReturnsCorrectString() {
        MacBook laptop = new MacBook("Air", 13.6, 8, 256, 4, 97, "grey", 12);
        String expected = "Air, 13.6, 8, 256, 4, 97, grey, 12";
        assertEquals(expected, laptop.toCSV());
    }
}