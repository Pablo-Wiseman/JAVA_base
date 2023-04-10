package interfaces;

public class Cooker implements Driver, Worker{
    @Override
    public void drive() {
        System.out.println("Cooker drives");
    }

    @Override
    public void work() {
        System.out.println("Cooker works");
    }
}

