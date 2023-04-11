package interfaces;

public class Cook implements Worker, Driver{
    @Override
    public void work() {
        System.out.println("cook works");
    }

    @Override
    public void drive() {
        System.out.println("cook drives");
    }
}
