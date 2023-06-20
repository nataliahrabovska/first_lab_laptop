package ua.lviv.iot.algo.part1.laptop.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class GamingLaptopTest {
    @Test
    public void testReplaceBattery() {
        var gamingLaptop = new GamingLaptop();
        assertEquals(100, gamingLaptop.replaceBattery(100));
        assertNotEquals(98, gamingLaptop.replaceBattery(39));
    }
    @Test
    void getHeaders_ReturnsCorrectString() {
        GamingLaptop laptop = new GamingLaptop();
        assertEquals("model, screenSize, ram, storage, batteryLife, batteryLevel, graphicsProcessor, fansForCooling", laptop.getHeaders());
    }

    @Test
    void toCSV_ReturnsCorrectString() {
        GamingLaptop laptop = new GamingLaptop("Victus", 15.6, 8, 512, 4, 99, "Nvidia", 2);
        String expected = "Victus, 15.6, 8, 512, 4, 99, Nvidia, 2";
        assertEquals(expected, laptop.toCSV());
    }
}
