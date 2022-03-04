package creational.abstractFactory;

public class VictorianSofa implements Sofa{
    @Override
    public void layOn() {
        System.out.println("sleep");
    }

    @Override
    public void hasLegs() {
        System.out.println("maybe more");
    }
}
