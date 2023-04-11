package interfaces;

public class WaiterPerson implements Waiter{
    @Override
    public void bringOrder(String dish) {
        System.out.println("I bring " + dish);
    }
}
