package ua.lviv.iot.algo.part1.laptop2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MacBookTest {
    @Test
    public void testReplaceBattery(){
        var macBook = new MacBook();
        assertEquals(100,macBook.replaceBattery(100));
    }

}