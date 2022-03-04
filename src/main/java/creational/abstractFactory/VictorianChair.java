package creational.abstractFactory;

public class VictorianChair implements Chair{
    @Override
    public void hasLegs() {
        System.out.println("Chair said");
    }

    @Override
    public void sitOn() {
        System.out.println("Don't fall");
    }
}
