package interfaces;

public class Dog extends Animal implements AbleToRun{
    @Override
    public void eat() {
        System.out.println("dog eats meat");
    }

    public void run(){
        System.out.println("dog run");
    }
}
