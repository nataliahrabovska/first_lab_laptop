package ua.lviv.iot.algo.part1.laptop2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NoteBookTest {
    @Test
    public void testReplaceBattery() {
        var noteBook = new NoteBook();
        assertEquals(100, noteBook.replaceBattery(100));
    }
}