package ua.lviv.iot.algo.part1.laptop.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NoteBookTest {
    @Test
    public void testReplaceBattery() {
        var noteBook = new NoteBook();
        assertEquals(100, noteBook.replaceBattery(100));
    }

    @Test
    void getHeaders_ReturnsCorrectString() {
        NoteBook laptop = new NoteBook();
        assertEquals("model, screenSize, ram, storage, batteryLife, batteryLevel, matrixType, ghz", laptop.getHeaders());
    }

    @Test
    void toCSV_ReturnsCorrectString() {
        NoteBook laptop = new NoteBook("ASUS", 17.3, 8, 512, 6, 98, "IPS", 60);
        String expected = "ASUS, 17.3, 8, 512, 6, 98, IPS, 60";
        assertEquals(expected, laptop.toCSV());
    }
}