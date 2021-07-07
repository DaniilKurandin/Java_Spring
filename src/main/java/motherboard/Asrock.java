package motherboard;

import interfaces.Motherboard;

public class Asrock implements Motherboard {
    @Override
    public boolean createMotherboard() {
        System.out.println("Motherboard Asrock is created");
        return true;
    }
}
