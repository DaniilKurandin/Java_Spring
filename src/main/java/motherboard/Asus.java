package motherboard;

import interfaces.Motherboard;

public class Asus implements Motherboard {
    @Override
    public boolean createMotherboard() {
        System.out.println("Motherboard Asus is created");
        return true;
    }
}
