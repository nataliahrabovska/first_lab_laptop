package ua.lviv.iot.algo.part1.laptop1;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@ToString

public class Laptop {
    private String model;
    private double screenSize;
    private int ram;
    private int storage;
    private int batteryLife;
    private int batteryLevel;
    private static Laptop instance = new Laptop();

    public Laptop() {
        model = "Unknown";
        screenSize = 15.6;
        ram = 8;
        storage = 256;
        batteryLife = 5;
        batteryLevel = 0;
    }
    public void addRam(int value){
        ram += value;
    }
    public void addStorage(int value){
        storage += value;
    }
    public void charge(){
        batteryLevel = 100;
    }
    public static Laptop getInstance() {

        return instance;
    }
    public static void main(String[] args) {
        Laptop[] laptops = new Laptop[4];
        laptops[0] = new Laptop();
        laptops[1] = new Laptop("HP",12.0,16,64,3,100);
        laptops[2] = Laptop.getInstance();
        laptops[3] = Laptop.getInstance();

        int i = 0;
        while (i < laptops.length) {
            System.out.println(laptops[i].toString());
            i++;
        }
    }
}