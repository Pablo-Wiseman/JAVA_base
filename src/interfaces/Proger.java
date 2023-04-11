package interfaces;

public class Proger implements Worker, Driver {
    @Override
    public void work() {
        System.out.println("proger works");
    }

    @Override
    public void drive() {
        System.out.println("proger drives");
    }
}
