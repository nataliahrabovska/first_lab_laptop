package ua.lviv.iot.algo.part1.laptop2;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AbstractLaptopManagerTest {
    private List<AbstractLaptop> list = new ArrayList<>();
    private AbstractLaptopManager manager;
    private AbstractLaptop laptop1;
    private AbstractLaptop laptop2;
    private AbstractLaptop laptop3;
    private AbstractLaptop laptop4;

    @BeforeEach
    public void addingLaptop() {
        laptop1 = new GamingLaptop("Victus", 15.6, 8, 512, 4, 99, "Nvidia  ", 2);
        laptop2 = new MacBook("Air Pro", 13.3, 8, 512, 5, 92, "silver", 12);
        laptop3 = new NoteBook("Thomson", 14.1, 4, 128, 5, 91, "TN", 60);
        laptop4 = new Ultrabook("Redmi", 13.0, 16, 128, 4, 75, 0.9, 4);
        list.add(laptop1);
        list.add(laptop2);
        list.add(laptop3);
        list.add(laptop4);
        manager = new AbstractLaptopManager(list);

    }

    @Test
    public void testElse() {
        assertEquals(list, manager.printAll());
    }

    @Test
    void testFindByModel() {
        List<AbstractLaptop> expectedOutput = new ArrayList<>();
        expectedOutput.add(laptop4);
        assertEquals(expectedOutput, manager.findByModel("Redmi"));
    }

    @Test
    void testFindByRamGreaterThan() {
        List<AbstractLaptop> expectedOutput = new ArrayList<>();
        expectedOutput.add(laptop1);
        expectedOutput.add(laptop2);
        expectedOutput.add(laptop4);
        assertEquals(expectedOutput, manager.findByRamGreaterThan(4));
    }
    @Test
    void testAddLaptopToList(){
        manager.addLaptopToList(new GamingLaptop("Victus", 15.6, 8, 512, 4, 99, "Nvidia  ", 2));
        assertEquals(5,manager.getLaptops().size());
    }
}