package interfaces;

public class Bird extends Animal implements AbleToRun, AbleToFly{
    @Override
    public void eat() {
        System.out.println("bird eats wheat");
    }

    @Override
    public void fly() {
        System.out.println("bird flies");
    }

    @Override
    public void run() {
        System.out.println("bird run");
    }
}
