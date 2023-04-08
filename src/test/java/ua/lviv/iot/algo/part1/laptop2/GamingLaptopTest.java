package ua.lviv.iot.algo.part1.laptop2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GamingLaptopTest {
    @Test
    public void testReplaceBattery() {
        var gamingLaptop = new GamingLaptop();
        assertEquals(100, gamingLaptop.replaceBattery(100));
    }
}