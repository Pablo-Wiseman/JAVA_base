package interfaces;

public class Programmer implements Driver, Worker{
    @Override
    public void drive() {
        System.out.println("Programmer drives");
    }

    @Override
    public void work() {
        System.out.println("Programmer works");
    }
}
