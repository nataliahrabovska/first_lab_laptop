package ua.lviv.iot.algo.part1.laptop2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.LinkedList;
import java.util.stream.Collectors;

@Setter
@Getter
@AllArgsConstructor
@ToString

public class AbstractLaptopManager {
    private final List<AbstractLaptop> laptops = new LinkedList<>();

    public void addLaptopToList(AbstractLaptop laptop) {
        laptops.add(laptop);
    }

    public void findByModel(String model) {
        laptops.stream()
                .filter(al -> al.getModel().equals(model))
                .forEach(al -> System.out.println(al));
    }

    public void findByRamGreaterThan(int ram) {
        laptops.stream()
                .filter(al -> al.getRam() > ram)
                .forEach(al -> System.out.println(al));
    }

    public static void main(String[] args) {
        AbstractLaptopManager manager = new AbstractLaptopManager();
        manager.addLaptopToList(new GamingLaptop("Victus", 15.6, 8, 512, 4, 99, "Nvidia  ", 2));
        manager.addLaptopToList(new GamingLaptop("Legion", 15.6, 16, 512, 5, 100, "AMD Ryzen", 2));
        manager.addLaptopToList(new Ultrabook("HP", 12.0, 16, 64, 3, 100, 1.2, 3));
        manager.addLaptopToList(new Ultrabook("Redmi", 13.0, 8, 128, 4, 75, 0.9, 4));
        manager.addLaptopToList(new MacBook("Air", 13.6, 8, 256, 4, 97, "grey", 12));
        manager.addLaptopToList(new MacBook("Air Pro", 13.3, 8, 512, 5, 92, "silver", 12));
        manager.addLaptopToList(new NoteBook("Thomson", 14.1, 4, 128, 5, 91, "TN", 60));
        manager.addLaptopToList(new NoteBook("ASUS", 17.3, 8, 512, 6, 98, "IPS", 60));

        for (AbstractLaptop laptop : manager.laptops) {
            System.out.println(laptop.toString());
        }
    }
}




