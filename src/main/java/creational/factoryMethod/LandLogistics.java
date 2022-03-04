package creational.factoryMethod;

public class LandLogistics implements Logistics{
    @Override
    public Transport createTransport() {
        return new Truck();
    }

    @Override
    public void doLogistics() {
        Transport transport = createTransport();
        System.out.println("doing processing");
        transport.deliver();
    }
}
