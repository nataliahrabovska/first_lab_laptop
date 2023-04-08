package ua.lviv.iot.algo.part1.laptop2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import ua.lviv.iot.algo.part1.laptop1.Laptop;
import java.util.List;
import java.util.LinkedList;
import java.util.stream.Collectors;

    @Setter
    @Getter
    @ToString

    public class AbstractLaptopManager {
        private List<AbstractLaptop> laptops = new LinkedList<>();

        public AbstractLaptopManager(List<AbstractLaptop> list) {
            laptops = list;
        }

        public void addLaptopToList(AbstractLaptop laptop) {
            laptops.add(laptop);
        }

        public List<AbstractLaptop> findByModel(String model) {
            return laptops.stream()
                    .filter(al -> al.getModel().equals(model))
                    .collect(Collectors.toList());
        }

        public List<AbstractLaptop> findByRamGreaterThan(int ram) {
            return laptops.stream()
                    .filter(al -> al.getRam() > ram)
                    .collect(Collectors.toList());
        }
        public List<AbstractLaptop> printAll(){
            for(int i=0;i<laptops.size();i++){
                System.out.println(laptops.get(i));
            }
            return laptops;
        }
    }
