package ua.lviv.iot.algo.part1.laptop2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UltrabookTest {
    @Test
    public void testReplaceBattery() {
        var ultrabook = new Ultrabook();
        assertEquals(100, ultrabook.replaceBattery(100));
    }
}