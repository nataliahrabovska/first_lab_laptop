package ua.lviv.iot.algo.part1.laptop.manager;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import ua.lviv.iot.algo.part1.laptop.models.AbstractLaptop;
import ua.lviv.iot.algo.part1.laptop.models.GamingLaptop;
import ua.lviv.iot.algo.part1.laptop.models.MacBook;
import ua.lviv.iot.algo.part1.laptop.models.NoteBook;
import ua.lviv.iot.algo.part1.laptop.models.Ultrabook;
import ua.lviv.iot.algo.part1.laptop.writer.LaptopWriter;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@Setter
@Getter
@ToString

public class AbstractLaptopManager {
    private List<AbstractLaptop> laptops = new LinkedList<>();

    public AbstractLaptopManager(final List<AbstractLaptop> list) {
        laptops = list;
    }

    public void addLaptopToList(final AbstractLaptop laptop) {
        laptops.add(laptop);
    }

    public List<AbstractLaptop> findByModel(final String model) {
        return laptops.stream()
                .filter(al -> al.getModel().equals(model))
                .collect(Collectors.toList());
    }

    public List<AbstractLaptop> findByRamGreaterThan(final int ram) {
        return laptops.stream()
                .filter(al -> al.getRam() > ram)
                .collect(Collectors.toList());
    }

    public List<AbstractLaptop> printAll() {
        for (int i = 0; i < laptops.size(); i++) {
            System.out.println(laptops.get(i));
        }
        return laptops;
    }

    public static void main(String[] args) {
        List<AbstractLaptop> laptopList = new LinkedList<>();
        laptopList.add(new GamingLaptop("Victus", 15.6, 8, 512, 4, 99, "Nvidia  ", 2));
        laptopList.add(new GamingLaptop("Legion", 15.6, 16, 512, 5, 100, "AMD Ryzen", 2));
        laptopList.add(new Ultrabook("HP", 12.0, 16, 64, 3, 100, 1.2, 3));
        laptopList.add(new NoteBook("HP", 12.0, 16, 64, 3, 100, "Ips", 3));
        laptopList.add(new Ultrabook("Redmi", 13.0, 8, 128, 4, 75, 0.9, 4));
        laptopList.add(new MacBook("Air", 13.6, 8, 256, 4, 97, "grey", 12));

        AbstractLaptopManager abstractLaptopManager = new AbstractLaptopManager(laptopList);
        LaptopWriter laptopWriter = new LaptopWriter();

        laptopWriter.writeToFile(laptopList);
    }
}
