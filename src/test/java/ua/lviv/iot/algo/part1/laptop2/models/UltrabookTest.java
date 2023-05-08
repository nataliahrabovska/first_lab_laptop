package ua.lviv.iot.algo.part1.laptop2.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UltrabookTest {
    @Test
    public void testReplaceBattery() {
        var ultrabook = new Ultrabook();
        assertEquals(100, ultrabook.replaceBattery(100));
    }
    @Test
    void getHeaders_ReturnsCorrectString() {
        Ultrabook laptop = new Ultrabook();
        assertEquals("model, screenSize, ram, storage, batteryLife, batteryLevel, weightOfTheDevice, deviceThickness", laptop.getHeaders());
    }

    @Test
    void toCSV_ReturnsCorrectString() {
        Ultrabook laptop = new Ultrabook("HP", 12.0, 16, 64, 3, 100, 1.2, 3);
        String expected = "HP, 12.0, 16, 64, 3, 100, 1.2, 3";
        assertEquals(expected, laptop.toCSV());
    }
}