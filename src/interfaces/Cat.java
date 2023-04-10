package interfaces;

public class Cat extends Animal implements AbleToRun{
    @Override
    public void eat() {
        System.out.println("cat eats milk");
    }

    public void run(){
        System.out.println("cat run");
    }
}
