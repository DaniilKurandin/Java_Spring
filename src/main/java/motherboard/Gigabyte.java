package motherboard;

import interfaces.Motherboard;

public class Gigabyte implements Motherboard {
    @Override
    public boolean createMotherboard() {
        System.out.println("Motherboard Gigabyte is created");
        return true;
    }
}
