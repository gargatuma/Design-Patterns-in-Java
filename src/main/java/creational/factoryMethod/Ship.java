package creational.factoryMethod;

public class Ship extends Transport{
    @Override
    void deliver() {
        System.out.println("delivered");
    }
}
